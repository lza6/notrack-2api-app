package defpackage;

import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.c;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ny1 {
    /* JADX WARN: Code duplicated, block: B:112:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x014d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:127:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0171  */
    /* JADX WARN: Code duplicated, block: B:131:0x0175  */
    /* JADX WARN: Code duplicated, block: B:132:0x017a  */
    /* JADX WARN: Code duplicated, block: B:135:0x017f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0193  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00de  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    @cv0
    public static final void LazyColumn(c cVar, g22 g22Var, hs2 hs2Var, boolean z, gl glVar, y7 y7Var, w71 w71Var, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        g22 g22VarRememberLazyListState;
        hs2 hs2Var2;
        int i4;
        boolean z2;
        int i5;
        gl glVar2;
        int i6;
        y7 y7Var2;
        int i7;
        w71 w71Var2;
        int i8;
        int i9;
        boolean z3;
        kk0 kk0Var;
        c cVar2;
        g22 g22Var2;
        hs2 hs2Var3;
        boolean z4;
        gl glVar3;
        y7 y7Var3;
        w71 w71Var3;
        w33 w33VarV;
        c cVar3;
        hs2 is2Var;
        int i10;
        y7 start;
        w71 w71VarFlingBehavior;
        y7 y7Var4;
        dl dlVar;
        int i11;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-563353797);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                g22VarRememberLazyListState = g22Var;
                int i13 = kk0Var2.h(g22VarRememberLazyListState) ? 32 : 16;
                i3 |= i13;
            } else {
                g22VarRememberLazyListState = g22Var;
            }
            i3 |= i13;
        } else {
            g22VarRememberLazyListState = g22Var;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                hs2Var2 = hs2Var;
                i3 |= kk0Var2.h(hs2Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (kk0Var2.i(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        glVar2 = glVar;
                        if (kk0Var2.h(glVar2)) {
                            i11 = 16384;
                        }
                        i3 |= i11;
                    } else {
                        glVar2 = glVar;
                    }
                    i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i11;
                } else {
                    glVar2 = glVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        y7Var2 = y7Var;
                        if (kk0Var2.h(y7Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            w71Var2 = w71Var;
                            int i15 = kk0Var2.h(w71Var2) ? 1048576 : 524288;
                            i3 |= i15;
                        } else {
                            w71Var2 = w71Var;
                        }
                        i3 |= i15;
                    } else {
                        w71Var2 = w71Var;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.j(le1Var)) {
                                i8 = 8388608;
                            } else {
                                i8 = 4194304;
                            }
                            i3 |= i8;
                        }
                        i9 = i3;
                        if ((i3 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var2.S(i9 & 1, z3)) {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i12 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar;
                                }
                                if ((i2 & 2) != 0) {
                                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                    i9 &= -113;
                                }
                                if (i14 != 0) {
                                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    is2Var = hs2Var2;
                                }
                                if (i4 != 0) {
                                    z2 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    if (z2) {
                                        dlVar = hl.d;
                                    } else {
                                        dlVar = hl.c;
                                    }
                                    glVar2 = dlVar;
                                    i10 = i9 & (-57345);
                                } else {
                                    i10 = i9;
                                }
                                if (i6 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var2;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                } else {
                                    w71VarFlingBehavior = w71Var2;
                                }
                                y7Var4 = start;
                            } else {
                                kk0Var2.V();
                                i10 = (i2 & 2) != 0 ? i9 & (-113) : i9;
                                if ((i2 & 16) != 0) {
                                    i10 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                }
                                g22VarRememberLazyListState = g22VarRememberLazyListState;
                                glVar2 = glVar2;
                                w71VarFlingBehavior = w71Var2;
                                cVar3 = cVar;
                                z2 = z2;
                                y7Var4 = y7Var2;
                                is2Var = hs2Var2;
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                            cVar2 = cVar3;
                            g22Var2 = g22VarRememberLazyListState;
                            hs2Var3 = is2Var;
                            z4 = z2;
                            glVar3 = glVar2;
                            y7Var3 = y7Var4;
                            w71Var3 = w71VarFlingBehavior;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            g22Var2 = g22VarRememberLazyListState;
                            hs2Var3 = hs2Var2;
                            z4 = z2;
                            glVar3 = glVar2;
                            y7Var3 = y7Var2;
                            w71Var3 = w71Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                        }
                    }
                    i3 |= 12582912;
                    i9 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    dlVar = hl.c;
                                } else {
                                    dlVar = hl.d;
                                }
                                glVar2 = dlVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            y7Var4 = start;
                        } else {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    dlVar = hl.c;
                                } else {
                                    dlVar = hl.d;
                                }
                                glVar2 = dlVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            y7Var4 = start;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                        cVar2 = cVar3;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = is2Var;
                        z4 = z2;
                        glVar3 = glVar2;
                        y7Var3 = y7Var4;
                        w71Var3 = w71VarFlingBehavior;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z4 = z2;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                y7Var2 = y7Var;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    i9 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    dlVar = hl.c;
                                } else {
                                    dlVar = hl.d;
                                }
                                glVar2 = dlVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            y7Var4 = start;
                        } else {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    dlVar = hl.c;
                                } else {
                                    dlVar = hl.d;
                                }
                                glVar2 = dlVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            y7Var4 = start;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                        cVar2 = cVar3;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = is2Var;
                        z4 = z2;
                        glVar3 = glVar2;
                        y7Var3 = y7Var4;
                        w71Var3 = w71VarFlingBehavior;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z4 = z2;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    glVar2 = glVar;
                    if (kk0Var2.h(glVar2)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    glVar2 = glVar;
                }
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i11;
            } else {
                glVar2 = glVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    y7Var2 = y7Var;
                    if (kk0Var2.h(y7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    i9 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    dlVar = hl.c;
                                } else {
                                    dlVar = hl.d;
                                }
                                glVar2 = dlVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            y7Var4 = start;
                        } else {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    dlVar = hl.c;
                                } else {
                                    dlVar = hl.d;
                                }
                                glVar2 = dlVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            y7Var4 = start;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                        cVar2 = cVar3;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = is2Var;
                        z4 = z2;
                        glVar3 = glVar2;
                        y7Var3 = y7Var4;
                        w71Var3 = w71VarFlingBehavior;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z4 = z2;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            y7Var2 = y7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i15;
            } else {
                w71Var2 = w71Var;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                }
            }
            i3 |= 12582912;
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            dlVar = hl.c;
                        } else {
                            dlVar = hl.d;
                        }
                        glVar2 = dlVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    y7Var4 = start;
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            dlVar = hl.c;
                        } else {
                            dlVar = hl.d;
                        }
                        glVar2 = dlVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    y7Var4 = start;
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                cVar2 = cVar3;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = is2Var;
                z4 = z2;
                glVar3 = glVar2;
                y7Var3 = y7Var4;
                w71Var3 = w71VarFlingBehavior;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z4 = z2;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
            }
        }
        i3 |= 384;
        hs2Var2 = hs2Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (kk0Var2.i(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    glVar2 = glVar;
                    if (kk0Var2.h(glVar2)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    glVar2 = glVar;
                }
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i11;
            } else {
                glVar2 = glVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    y7Var2 = y7Var;
                    if (kk0Var2.h(y7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    i9 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    dlVar = hl.c;
                                } else {
                                    dlVar = hl.d;
                                }
                                glVar2 = dlVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            y7Var4 = start;
                        } else {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    dlVar = hl.c;
                                } else {
                                    dlVar = hl.d;
                                }
                                glVar2 = dlVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            y7Var4 = start;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                        cVar2 = cVar3;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = is2Var;
                        z4 = z2;
                        glVar3 = glVar2;
                        y7Var3 = y7Var4;
                        w71Var3 = w71VarFlingBehavior;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z4 = z2;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            y7Var2 = y7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i15;
            } else {
                w71Var2 = w71Var;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                }
            }
            i3 |= 12582912;
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            dlVar = hl.c;
                        } else {
                            dlVar = hl.d;
                        }
                        glVar2 = dlVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    y7Var4 = start;
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            dlVar = hl.c;
                        } else {
                            dlVar = hl.d;
                        }
                        glVar2 = dlVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    y7Var4 = start;
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                cVar2 = cVar3;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = is2Var;
                z4 = z2;
                glVar3 = glVar2;
                y7Var3 = y7Var4;
                w71Var3 = w71VarFlingBehavior;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z4 = z2;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                glVar2 = glVar;
                if (kk0Var2.h(glVar2)) {
                    i11 = 16384;
                }
                i3 |= i11;
            } else {
                glVar2 = glVar;
            }
            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i11;
        } else {
            glVar2 = glVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                y7Var2 = y7Var;
                if (kk0Var2.h(y7Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i15;
            } else {
                w71Var2 = w71Var;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                dlVar = hl.c;
                            } else {
                                dlVar = hl.d;
                            }
                            glVar2 = dlVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        y7Var4 = start;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
                }
            }
            i3 |= 12582912;
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            dlVar = hl.c;
                        } else {
                            dlVar = hl.d;
                        }
                        glVar2 = dlVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    y7Var4 = start;
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            dlVar = hl.c;
                        } else {
                            dlVar = hl.d;
                        }
                        glVar2 = dlVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    y7Var4 = start;
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                cVar2 = cVar3;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = is2Var;
                z4 = z2;
                glVar3 = glVar2;
                y7Var3 = y7Var4;
                w71Var3 = w71VarFlingBehavior;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z4 = z2;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
            }
        }
        i3 |= 196608;
        y7Var2 = y7Var;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                w71Var2 = w71Var;
                if (kk0Var2.h(w71Var2)) {
                }
                i3 |= i15;
            } else {
                w71Var2 = w71Var;
            }
            i3 |= i15;
        } else {
            w71Var2 = w71Var;
        }
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            if ((i & 12582912) == 0) {
                if (kk0Var2.j(le1Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            dlVar = hl.c;
                        } else {
                            dlVar = hl.d;
                        }
                        glVar2 = dlVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    y7Var4 = start;
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            dlVar = hl.c;
                        } else {
                            dlVar = hl.d;
                        }
                        glVar2 = dlVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    y7Var4 = start;
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                cVar2 = cVar3;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = is2Var;
                z4 = z2;
                glVar3 = glVar2;
                y7Var3 = y7Var4;
                w71Var3 = w71VarFlingBehavior;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z4 = z2;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
            }
        }
        i3 |= 12582912;
        i9 = i3;
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var2.S(i9 & 1, z3)) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i9 &= -113;
                }
                if (i14 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z2) {
                        dlVar = hl.c;
                    } else {
                        dlVar = hl.d;
                    }
                    glVar2 = dlVar;
                    i10 = i9 & (-57345);
                } else {
                    i10 = i9;
                }
                if (i6 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                if ((i2 & 64) != 0) {
                    i10 &= -3670017;
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                } else {
                    w71VarFlingBehavior = w71Var2;
                }
                y7Var4 = start;
            } else {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i9 &= -113;
                }
                if (i14 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z2) {
                        dlVar = hl.c;
                    } else {
                        dlVar = hl.d;
                    }
                    glVar2 = dlVar;
                    i10 = i9 & (-57345);
                } else {
                    i10 = i9;
                }
                if (i6 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                if ((i2 & 64) != 0) {
                    i10 &= -3670017;
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                } else {
                    w71VarFlingBehavior = w71Var2;
                }
                y7Var4 = start;
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            LazyColumn(cVar3, g22VarRememberLazyListState, is2Var, z2, glVar2, y7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
            cVar2 = cVar3;
            g22Var2 = g22VarRememberLazyListState;
            hs2Var3 = is2Var;
            z4 = z2;
            glVar3 = glVar2;
            y7Var3 = y7Var4;
            w71Var3 = w71VarFlingBehavior;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            g22Var2 = g22VarRememberLazyListState;
            hs2Var3 = hs2Var2;
            z4 = z2;
            glVar3 = glVar2;
            y7Var3 = y7Var2;
            w71Var3 = w71Var2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, glVar3, y7Var3, w71Var3, le1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:121:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:128:0x017a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x018b  */
    /* JADX WARN: Code duplicated, block: B:136:0x018e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0193  */
    /* JADX WARN: Code duplicated, block: B:140:0x0196  */
    /* JADX WARN: Code duplicated, block: B:141:0x019b  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:147:0x01af  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x0208  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
    @cv0
    public static final void LazyColumn(c cVar, g22 g22Var, hs2 hs2Var, boolean z, gl glVar, y7 y7Var, w71 w71Var, boolean z2, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        g22 g22VarRememberLazyListState;
        hs2 hs2Var2;
        int i4;
        boolean z3;
        int i5;
        gl glVar2;
        int i6;
        y7 y7Var2;
        int i7;
        w71 w71Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        kk0 kk0Var;
        c cVar2;
        g22 g22Var2;
        hs2 hs2Var3;
        boolean z5;
        gl glVar3;
        y7 y7Var3;
        w71 w71Var3;
        boolean z6;
        w33 w33VarV;
        c cVar3;
        hs2 is2Var;
        gl glVar4;
        y7 start;
        w71 w71VarFlingBehavior;
        boolean z7;
        c cVar4;
        g22 g22Var3;
        hs2 hs2Var4;
        y7 y7Var4;
        boolean z8;
        w71 w71Var4;
        int i13;
        gl glVar5;
        int i14;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-740714857);
        int i15 = i2 & 1;
        if (i15 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                g22VarRememberLazyListState = g22Var;
                int i16 = kk0Var2.h(g22VarRememberLazyListState) ? 32 : 16;
                i3 |= i16;
            } else {
                g22VarRememberLazyListState = g22Var;
            }
            i3 |= i16;
        } else {
            g22VarRememberLazyListState = g22Var;
        }
        int i17 = i2 & 4;
        if (i17 == 0) {
            if ((i & 384) == 0) {
                hs2Var2 = hs2Var;
                i3 |= kk0Var2.h(hs2Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (kk0Var2.i(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        glVar2 = glVar;
                        if (kk0Var2.h(glVar2)) {
                            i14 = 16384;
                        }
                        i3 |= i14;
                    } else {
                        glVar2 = glVar;
                    }
                    i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i14;
                } else {
                    glVar2 = glVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        y7Var2 = y7Var;
                        if (kk0Var2.h(y7Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            w71Var2 = w71Var;
                            int i18 = kk0Var2.h(w71Var2) ? 1048576 : 524288;
                            i3 |= i18;
                        } else {
                            w71Var2 = w71Var;
                        }
                        i3 |= i18;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i8 = i2 & Uuid.SIZE_BITS;
                    if (i8 != 0) {
                        i3 |= 12582912;
                        i9 = i15;
                    } else {
                        i9 = i15;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.i(z2)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        if ((i & 100663296) == 0) {
                            if (kk0Var2.j(le1Var)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (kk0Var2.S(i12 & 1, z4)) {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i9 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar;
                                }
                                if ((i2 & 2) != 0) {
                                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                    i12 &= -113;
                                }
                                if (i17 != 0) {
                                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    is2Var = hs2Var2;
                                }
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    if (z3) {
                                        glVar4 = hl.d;
                                    } else {
                                        glVar4 = hl.c;
                                    }
                                    i12 &= -57345;
                                } else {
                                    glVar4 = glVar2;
                                }
                                if (i6 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var2;
                                }
                                if ((i2 & 64) != 0) {
                                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    w71VarFlingBehavior = w71Var2;
                                }
                                if (i8 != 0) {
                                    cVar4 = cVar3;
                                    g22Var3 = g22VarRememberLazyListState;
                                    hs2Var4 = is2Var;
                                    z8 = z3;
                                    w71Var4 = w71VarFlingBehavior;
                                    i13 = i12;
                                    z7 = true;
                                    glVar5 = glVar4;
                                    y7Var4 = start;
                                } else {
                                    z7 = z2;
                                    cVar4 = cVar3;
                                    g22Var3 = g22VarRememberLazyListState;
                                    hs2Var4 = is2Var;
                                    y7Var4 = start;
                                    z8 = z3;
                                    w71Var4 = w71VarFlingBehavior;
                                    i13 = i12;
                                    glVar5 = glVar4;
                                }
                            } else {
                                kk0Var2.V();
                                if ((i2 & 2) != 0) {
                                    i12 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                cVar4 = cVar;
                                z7 = z2;
                                z8 = z3;
                                y7Var4 = y7Var2;
                                w71Var4 = w71Var2;
                                i13 = i12;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = hs2Var2;
                                glVar5 = glVar2;
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                            cVar2 = cVar4;
                            g22Var2 = g22Var3;
                            hs2Var3 = hs2Var4;
                            z5 = z8;
                            glVar3 = glVar5;
                            y7Var3 = y7Var4;
                            w71Var3 = w71Var4;
                            z6 = z7;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            g22Var2 = g22VarRememberLazyListState;
                            hs2Var3 = hs2Var2;
                            z5 = z3;
                            glVar3 = glVar2;
                            y7Var3 = y7Var2;
                            w71Var3 = w71Var2;
                            z6 = z2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                        }
                    }
                    i3 |= 100663296;
                    i12 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                glVar5 = glVar4;
                                y7Var4 = start;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                glVar5 = glVar4;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                glVar5 = glVar4;
                                y7Var4 = start;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                glVar5 = glVar4;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        glVar3 = glVar5;
                        y7Var3 = y7Var4;
                        w71Var3 = w71Var4;
                        z6 = z7;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                y7Var2 = y7Var;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i15;
                } else {
                    i9 = i15;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                glVar5 = glVar4;
                                y7Var4 = start;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                glVar5 = glVar4;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                glVar5 = glVar4;
                                y7Var4 = start;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                glVar5 = glVar4;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        glVar3 = glVar5;
                        y7Var3 = y7Var4;
                        w71Var3 = w71Var4;
                        z6 = z7;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                    }
                }
                i3 |= 100663296;
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    glVar3 = glVar5;
                    y7Var3 = y7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    glVar2 = glVar;
                    if (kk0Var2.h(glVar2)) {
                        i14 = 16384;
                    }
                    i3 |= i14;
                } else {
                    glVar2 = glVar;
                }
                i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i14;
            } else {
                glVar2 = glVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    y7Var2 = y7Var;
                    if (kk0Var2.h(y7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i15;
                } else {
                    i9 = i15;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                glVar5 = glVar4;
                                y7Var4 = start;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                glVar5 = glVar4;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                glVar5 = glVar4;
                                y7Var4 = start;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                glVar5 = glVar4;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        glVar3 = glVar5;
                        y7Var3 = y7Var4;
                        w71Var3 = w71Var4;
                        z6 = z7;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                    }
                }
                i3 |= 100663296;
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    glVar3 = glVar5;
                    y7Var3 = y7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            y7Var2 = y7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i18;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i15;
            } else {
                i9 = i15;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    glVar3 = glVar5;
                    y7Var3 = y7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                }
            }
            i3 |= 100663296;
            i12 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        glVar5 = glVar4;
                        y7Var4 = start;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        glVar5 = glVar4;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        glVar5 = glVar4;
                        y7Var4 = start;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        glVar5 = glVar4;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                glVar3 = glVar5;
                y7Var3 = y7Var4;
                w71Var3 = w71Var4;
                z6 = z7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
            }
        }
        i3 |= 384;
        hs2Var2 = hs2Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (kk0Var2.i(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    glVar2 = glVar;
                    if (kk0Var2.h(glVar2)) {
                        i14 = 16384;
                    }
                    i3 |= i14;
                } else {
                    glVar2 = glVar;
                }
                i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i14;
            } else {
                glVar2 = glVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    y7Var2 = y7Var;
                    if (kk0Var2.h(y7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i15;
                } else {
                    i9 = i15;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                glVar5 = glVar4;
                                y7Var4 = start;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                glVar5 = glVar4;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                glVar5 = glVar4;
                                y7Var4 = start;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                glVar5 = glVar4;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        glVar3 = glVar5;
                        y7Var3 = y7Var4;
                        w71Var3 = w71Var4;
                        z6 = z7;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                    }
                }
                i3 |= 100663296;
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    glVar3 = glVar5;
                    y7Var3 = y7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            y7Var2 = y7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i18;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i15;
            } else {
                i9 = i15;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    glVar3 = glVar5;
                    y7Var3 = y7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                }
            }
            i3 |= 100663296;
            i12 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        glVar5 = glVar4;
                        y7Var4 = start;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        glVar5 = glVar4;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        glVar5 = glVar4;
                        y7Var4 = start;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        glVar5 = glVar4;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                glVar3 = glVar5;
                y7Var3 = y7Var4;
                w71Var3 = w71Var4;
                z6 = z7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                glVar2 = glVar;
                if (kk0Var2.h(glVar2)) {
                    i14 = 16384;
                }
                i3 |= i14;
            } else {
                glVar2 = glVar;
            }
            i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i14;
        } else {
            glVar2 = glVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                y7Var2 = y7Var;
                if (kk0Var2.h(y7Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i18;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i15;
            } else {
                i9 = i15;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            glVar5 = glVar4;
                            y7Var4 = start;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            glVar5 = glVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    glVar3 = glVar5;
                    y7Var3 = y7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
                }
            }
            i3 |= 100663296;
            i12 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        glVar5 = glVar4;
                        y7Var4 = start;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        glVar5 = glVar4;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        glVar5 = glVar4;
                        y7Var4 = start;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        glVar5 = glVar4;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                glVar3 = glVar5;
                y7Var3 = y7Var4;
                w71Var3 = w71Var4;
                z6 = z7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
            }
        }
        i3 |= 196608;
        y7Var2 = y7Var;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                w71Var2 = w71Var;
                if (kk0Var2.h(w71Var2)) {
                }
                i3 |= i18;
            } else {
                w71Var2 = w71Var;
            }
            i3 |= i18;
        } else {
            w71Var2 = w71Var;
        }
        i8 = i2 & Uuid.SIZE_BITS;
        if (i8 != 0) {
            i3 |= 12582912;
            i9 = i15;
        } else {
            i9 = i15;
            if ((i & 12582912) == 0) {
                if (kk0Var2.i(z2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
        }
        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            if ((i & 100663296) == 0) {
                if (kk0Var2.j(le1Var)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        glVar5 = glVar4;
                        y7Var4 = start;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        glVar5 = glVar4;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        glVar5 = glVar4;
                        y7Var4 = start;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        glVar5 = glVar4;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                glVar3 = glVar5;
                y7Var3 = y7Var4;
                w71Var3 = w71Var4;
                z6 = z7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
            }
        }
        i3 |= 100663296;
        i12 = i3;
        if ((i3 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (kk0Var2.S(i12 & 1, z4)) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i12 &= -113;
                }
                if (i17 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z3) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = hl.d;
                    }
                    i12 &= -57345;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                if ((i2 & 64) != 0) {
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    i12 &= -3670017;
                } else {
                    w71VarFlingBehavior = w71Var2;
                }
                if (i8 != 0) {
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i13 = i12;
                    z7 = true;
                    glVar5 = glVar4;
                    y7Var4 = start;
                } else {
                    z7 = z2;
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    y7Var4 = start;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i13 = i12;
                    glVar5 = glVar4;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i12 &= -113;
                }
                if (i17 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z3) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = hl.d;
                    }
                    i12 &= -57345;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                if ((i2 & 64) != 0) {
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    i12 &= -3670017;
                } else {
                    w71VarFlingBehavior = w71Var2;
                }
                if (i8 != 0) {
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i13 = i12;
                    z7 = true;
                    glVar5 = glVar4;
                    y7Var4 = start;
                } else {
                    z7 = z2;
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    y7Var4 = start;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i13 = i12;
                    glVar5 = glVar4;
                }
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            LazyColumn(cVar4, g22Var3, hs2Var4, z8, glVar5, y7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
            cVar2 = cVar4;
            g22Var2 = g22Var3;
            hs2Var3 = hs2Var4;
            z5 = z8;
            glVar3 = glVar5;
            y7Var3 = y7Var4;
            w71Var3 = w71Var4;
            z6 = z7;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            g22Var2 = g22VarRememberLazyListState;
            hs2Var3 = hs2Var2;
            z5 = z3;
            glVar3 = glVar2;
            y7Var3 = y7Var2;
            w71Var3 = w71Var2;
            z6 = z2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, le1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:104:0x011a  */
    /* JADX WARN: Code duplicated, block: B:106:0x011e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x0129  */
    /* JADX WARN: Code duplicated, block: B:113:0x013c  */
    /* JADX WARN: Code duplicated, block: B:114:0x013f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0148  */
    /* JADX WARN: Code duplicated, block: B:119:0x0158  */
    /* JADX WARN: Code duplicated, block: B:136:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0190  */
    /* JADX WARN: Code duplicated, block: B:138:0x0193  */
    /* JADX WARN: Code duplicated, block: B:141:0x0199  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01be  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:166:0x01de  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0254  */
    /* JADX WARN: Code duplicated, block: B:172:0x026b  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    public static final void LazyColumn(c cVar, g22 g22Var, hs2 hs2Var, boolean z, gl glVar, y7 y7Var, w71 w71Var, boolean z2, pr2 pr2Var, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        g22 g22VarRememberLazyListState;
        hs2 hs2Var2;
        int i4;
        boolean z3;
        int i5;
        gl glVar2;
        int i6;
        y7 y7Var2;
        int i7;
        w71 w71Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        kk0 kk0Var;
        c cVar2;
        g22 g22Var2;
        hs2 hs2Var3;
        boolean z5;
        gl glVar3;
        y7 y7Var3;
        w71 w71Var3;
        boolean z6;
        pr2 pr2Var2;
        w33 w33VarV;
        c cVar3;
        hs2 is2Var;
        gl glVar4;
        y7 start;
        w71 w71VarFlingBehavior;
        int i13;
        boolean z7;
        pr2 pr2VarRememberOverscrollEffect;
        c cVar4;
        g22 g22Var3;
        hs2 hs2Var4;
        gl glVar5;
        y7 y7Var4;
        boolean z8;
        w71 w71Var4;
        int i14;
        boolean z9;
        int i15;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(53695811);
        int i16 = i2 & 1;
        if (i16 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                g22VarRememberLazyListState = g22Var;
                int i17 = kk0Var2.h(g22VarRememberLazyListState) ? 32 : 16;
                i3 |= i17;
            } else {
                g22VarRememberLazyListState = g22Var;
            }
            i3 |= i17;
        } else {
            g22VarRememberLazyListState = g22Var;
        }
        int i18 = i2 & 4;
        if (i18 == 0) {
            if ((i & 384) == 0) {
                hs2Var2 = hs2Var;
                i3 |= kk0Var2.h(hs2Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (kk0Var2.i(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        glVar2 = glVar;
                        if (kk0Var2.h(glVar2)) {
                            i15 = 16384;
                        }
                        i3 |= i15;
                    } else {
                        glVar2 = glVar;
                    }
                    i15 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i15;
                } else {
                    glVar2 = glVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        y7Var2 = y7Var;
                        if (kk0Var2.h(y7Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            w71Var2 = w71Var;
                            int i19 = kk0Var2.h(w71Var2) ? 1048576 : 524288;
                            i3 |= i19;
                        } else {
                            w71Var2 = w71Var;
                        }
                        i3 |= i19;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i8 = i2 & Uuid.SIZE_BITS;
                    if (i8 != 0) {
                        i3 |= 12582912;
                        i9 = i16;
                    } else {
                        i9 = i16;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.i(z2)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((i & 805306368) == 0) {
                            if (kk0Var2.j(le1Var)) {
                                i11 = 536870912;
                            } else {
                                i11 = 268435456;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (kk0Var2.S(i12 & 1, z4)) {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i9 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar;
                                }
                                if ((i2 & 2) != 0) {
                                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                    i12 &= -113;
                                }
                                if (i18 != 0) {
                                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    is2Var = hs2Var2;
                                }
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    if (z3) {
                                        glVar4 = hl.d;
                                    } else {
                                        glVar4 = hl.c;
                                    }
                                    i12 &= -57345;
                                } else {
                                    glVar4 = glVar2;
                                }
                                if (i6 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var2;
                                }
                                if ((i2 & 64) != 0) {
                                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                    i13 = i12 & (-3670017);
                                } else {
                                    w71VarFlingBehavior = w71Var2;
                                    i13 = i12;
                                }
                                z7 = i8 == 0 ? z2 : true;
                                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    cVar4 = cVar3;
                                    pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                    g22Var3 = g22VarRememberLazyListState;
                                    hs2Var4 = is2Var;
                                    glVar5 = glVar4;
                                    y7Var4 = start;
                                    z8 = z3;
                                    w71Var4 = w71VarFlingBehavior;
                                    z9 = z7;
                                    i14 = (-234881025) & i13;
                                } else {
                                    pr2VarRememberOverscrollEffect = pr2Var;
                                    cVar4 = cVar3;
                                    g22Var3 = g22VarRememberLazyListState;
                                    hs2Var4 = is2Var;
                                    glVar5 = glVar4;
                                    y7Var4 = start;
                                    z8 = z3;
                                    w71Var4 = w71VarFlingBehavior;
                                    i14 = i13;
                                    z9 = z7;
                                }
                            } else {
                                kk0Var2.V();
                                i14 = (i2 & 2) != 0 ? i12 & (-113) : i12;
                                if ((i2 & 16) != 0) {
                                    i14 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i14 &= -3670017;
                                }
                                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i14 &= -234881025;
                                }
                                z9 = z2;
                                pr2VarRememberOverscrollEffect = pr2Var;
                                hs2Var4 = hs2Var2;
                                z8 = z3;
                                glVar5 = glVar2;
                                y7Var4 = y7Var2;
                                w71Var4 = w71Var2;
                                cVar4 = cVar;
                                g22Var3 = g22VarRememberLazyListState;
                            }
                            kk0Var2.s();
                            int i20 = i14 >> 3;
                            kk0Var = kk0Var2;
                            y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i20) | (3670016 & i20) | (i20 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                            cVar2 = cVar4;
                            g22Var2 = g22Var3;
                            hs2Var3 = hs2Var4;
                            z5 = z8;
                            w71Var3 = w71Var4;
                            z6 = z9;
                            pr2Var2 = pr2VarRememberOverscrollEffect;
                            y7Var3 = y7Var4;
                            glVar3 = glVar5;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            g22Var2 = g22VarRememberLazyListState;
                            hs2Var3 = hs2Var2;
                            z5 = z3;
                            glVar3 = glVar2;
                            y7Var3 = y7Var2;
                            w71Var3 = w71Var2;
                            z6 = z2;
                            pr2Var2 = pr2Var;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                        }
                    }
                    i3 |= 805306368;
                    i12 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        }
                        kk0Var2.s();
                        int i21 = i14 >> 3;
                        kk0Var = kk0Var2;
                        y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        w71Var3 = w71Var4;
                        z6 = z9;
                        pr2Var2 = pr2VarRememberOverscrollEffect;
                        y7Var3 = y7Var4;
                        glVar3 = glVar5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                        pr2Var2 = pr2Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                    }
                }
                i3 |= 196608;
                y7Var2 = y7Var;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i19;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i16;
                } else {
                    i9 = i16;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        }
                        kk0Var2.s();
                        int i22 = i14 >> 3;
                        kk0Var = kk0Var2;
                        y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i22) | (3670016 & i22) | (i22 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        w71Var3 = w71Var4;
                        z6 = z9;
                        pr2Var2 = pr2VarRememberOverscrollEffect;
                        y7Var3 = y7Var4;
                        glVar3 = glVar5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                        pr2Var2 = pr2Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                    }
                }
                i3 |= 805306368;
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i23 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i23) | (3670016 & i23) | (i23 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    y7Var3 = y7Var4;
                    glVar3 = glVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    glVar2 = glVar;
                    if (kk0Var2.h(glVar2)) {
                        i15 = 16384;
                    }
                    i3 |= i15;
                } else {
                    glVar2 = glVar;
                }
                i15 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i15;
            } else {
                glVar2 = glVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    y7Var2 = y7Var;
                    if (kk0Var2.h(y7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i19;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i16;
                } else {
                    i9 = i16;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        }
                        kk0Var2.s();
                        int i24 = i14 >> 3;
                        kk0Var = kk0Var2;
                        y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i24) | (3670016 & i24) | (i24 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        w71Var3 = w71Var4;
                        z6 = z9;
                        pr2Var2 = pr2VarRememberOverscrollEffect;
                        y7Var3 = y7Var4;
                        glVar3 = glVar5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                        pr2Var2 = pr2Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                    }
                }
                i3 |= 805306368;
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i25 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    y7Var3 = y7Var4;
                    glVar3 = glVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            y7Var2 = y7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i19;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i16;
            } else {
                i9 = i16;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i26 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    y7Var3 = y7Var4;
                    glVar3 = glVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                }
            }
            i3 |= 805306368;
            i12 = i3;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                }
                kk0Var2.s();
                int i27 = i14 >> 3;
                kk0Var = kk0Var2;
                y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                w71Var3 = w71Var4;
                z6 = z9;
                pr2Var2 = pr2VarRememberOverscrollEffect;
                y7Var3 = y7Var4;
                glVar3 = glVar5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
                pr2Var2 = pr2Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
            }
        }
        i3 |= 384;
        hs2Var2 = hs2Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (kk0Var2.i(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    glVar2 = glVar;
                    if (kk0Var2.h(glVar2)) {
                        i15 = 16384;
                    }
                    i3 |= i15;
                } else {
                    glVar2 = glVar;
                }
                i15 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i15;
            } else {
                glVar2 = glVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    y7Var2 = y7Var;
                    if (kk0Var2.h(y7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i19;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i16;
                } else {
                    i9 = i16;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = hl.d;
                                }
                                i12 &= -57345;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                glVar5 = glVar4;
                                y7Var4 = start;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        }
                        kk0Var2.s();
                        int i28 = i14 >> 3;
                        kk0Var = kk0Var2;
                        y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        w71Var3 = w71Var4;
                        z6 = z9;
                        pr2Var2 = pr2VarRememberOverscrollEffect;
                        y7Var3 = y7Var4;
                        glVar3 = glVar5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        glVar3 = glVar2;
                        y7Var3 = y7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                        pr2Var2 = pr2Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                    }
                }
                i3 |= 805306368;
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i29 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    y7Var3 = y7Var4;
                    glVar3 = glVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            y7Var2 = y7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i19;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i16;
            } else {
                i9 = i16;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i210 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i210) | (3670016 & i210) | (i210 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    y7Var3 = y7Var4;
                    glVar3 = glVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                }
            }
            i3 |= 805306368;
            i12 = i3;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                }
                kk0Var2.s();
                int i211 = i14 >> 3;
                kk0Var = kk0Var2;
                y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i211) | (3670016 & i211) | (i211 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                w71Var3 = w71Var4;
                z6 = z9;
                pr2Var2 = pr2VarRememberOverscrollEffect;
                y7Var3 = y7Var4;
                glVar3 = glVar5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
                pr2Var2 = pr2Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                glVar2 = glVar;
                if (kk0Var2.h(glVar2)) {
                    i15 = 16384;
                }
                i3 |= i15;
            } else {
                glVar2 = glVar;
            }
            i15 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i15;
        } else {
            glVar2 = glVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                y7Var2 = y7Var;
                if (kk0Var2.h(y7Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i19;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i16;
            } else {
                i9 = i16;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = hl.d;
                            }
                            i12 &= -57345;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            glVar5 = glVar4;
                            y7Var4 = start;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i212 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    y7Var3 = y7Var4;
                    glVar3 = glVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    glVar3 = glVar2;
                    y7Var3 = y7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
                }
            }
            i3 |= 805306368;
            i12 = i3;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                }
                kk0Var2.s();
                int i213 = i14 >> 3;
                kk0Var = kk0Var2;
                y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i213) | (3670016 & i213) | (i213 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                w71Var3 = w71Var4;
                z6 = z9;
                pr2Var2 = pr2VarRememberOverscrollEffect;
                y7Var3 = y7Var4;
                glVar3 = glVar5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
                pr2Var2 = pr2Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
            }
        }
        i3 |= 196608;
        y7Var2 = y7Var;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                w71Var2 = w71Var;
                if (kk0Var2.h(w71Var2)) {
                }
                i3 |= i19;
            } else {
                w71Var2 = w71Var;
            }
            i3 |= i19;
        } else {
            w71Var2 = w71Var;
        }
        i8 = i2 & Uuid.SIZE_BITS;
        if (i8 != 0) {
            i3 |= 12582912;
            i9 = i16;
        } else {
            i9 = i16;
            if ((i & 12582912) == 0) {
                if (kk0Var2.i(z2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
        }
        if ((i & 100663296) != 0) {
            i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((i & 805306368) == 0) {
                if (kk0Var2.j(le1Var)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = hl.d;
                        }
                        i12 &= -57345;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        glVar5 = glVar4;
                        y7Var4 = start;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                }
                kk0Var2.s();
                int i214 = i14 >> 3;
                kk0Var = kk0Var2;
                y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i214) | (3670016 & i214) | (i214 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                w71Var3 = w71Var4;
                z6 = z9;
                pr2Var2 = pr2VarRememberOverscrollEffect;
                y7Var3 = y7Var4;
                glVar3 = glVar5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                glVar3 = glVar2;
                y7Var3 = y7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
                pr2Var2 = pr2Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
            }
        }
        i3 |= 805306368;
        i12 = i3;
        if ((i3 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (kk0Var2.S(i12 & 1, z4)) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i12 &= -113;
                }
                if (i18 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z3) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = hl.d;
                    }
                    i12 &= -57345;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                if ((i2 & 64) != 0) {
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    i13 = i12 & (-3670017);
                } else {
                    w71VarFlingBehavior = w71Var2;
                    i13 = i12;
                }
                if (i8 == 0) {
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    cVar4 = cVar3;
                    pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    glVar5 = glVar4;
                    y7Var4 = start;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    z9 = z7;
                    i14 = (-234881025) & i13;
                } else {
                    pr2VarRememberOverscrollEffect = pr2Var;
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    glVar5 = glVar4;
                    y7Var4 = start;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i14 = i13;
                    z9 = z7;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i12 &= -113;
                }
                if (i18 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z3) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = hl.d;
                    }
                    i12 &= -57345;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                if ((i2 & 64) != 0) {
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    i13 = i12 & (-3670017);
                } else {
                    w71VarFlingBehavior = w71Var2;
                    i13 = i12;
                }
                if (i8 == 0) {
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    cVar4 = cVar3;
                    pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    glVar5 = glVar4;
                    y7Var4 = start;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    z9 = z7;
                    i14 = (-234881025) & i13;
                } else {
                    pr2VarRememberOverscrollEffect = pr2Var;
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    glVar5 = glVar4;
                    y7Var4 = start;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i14 = i13;
                    z9 = z7;
                }
            }
            kk0Var2.s();
            int i215 = i14 >> 3;
            kk0Var = kk0Var2;
            y12.LazyList(cVar4, g22Var3, hs2Var4, z8, true, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, y7Var4, glVar5, null, null, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i215) | (3670016 & i215) | (i215 & 29360128) | ((i14 << 12) & 1879048192), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
            cVar2 = cVar4;
            g22Var2 = g22Var3;
            hs2Var3 = hs2Var4;
            z5 = z8;
            w71Var3 = w71Var4;
            z6 = z9;
            pr2Var2 = pr2VarRememberOverscrollEffect;
            y7Var3 = y7Var4;
            glVar3 = glVar5;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            g22Var2 = g22VarRememberLazyListState;
            hs2Var3 = hs2Var2;
            z5 = z3;
            glVar3 = glVar2;
            y7Var3 = y7Var2;
            w71Var3 = w71Var2;
            z6 = z2;
            pr2Var2 = pr2Var;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, glVar3, y7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x014d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:127:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0171  */
    /* JADX WARN: Code duplicated, block: B:131:0x0175  */
    /* JADX WARN: Code duplicated, block: B:132:0x017a  */
    /* JADX WARN: Code duplicated, block: B:135:0x017f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0193  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00de  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    @cv0
    public static final void LazyRow(c cVar, g22 g22Var, hs2 hs2Var, boolean z, el elVar, z7 z7Var, w71 w71Var, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        g22 g22VarRememberLazyListState;
        hs2 hs2Var2;
        int i4;
        boolean z2;
        int i5;
        el elVar2;
        int i6;
        z7 z7Var2;
        int i7;
        w71 w71Var2;
        int i8;
        int i9;
        boolean z3;
        kk0 kk0Var;
        c cVar2;
        g22 g22Var2;
        hs2 hs2Var3;
        boolean z4;
        el elVar3;
        z7 z7Var3;
        w71 w71Var3;
        w33 w33VarV;
        c cVar3;
        hs2 is2Var;
        int i10;
        z7 top;
        w71 w71VarFlingBehavior;
        z7 z7Var4;
        cl clVar;
        int i11;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(407929823);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                g22VarRememberLazyListState = g22Var;
                int i13 = kk0Var2.h(g22VarRememberLazyListState) ? 32 : 16;
                i3 |= i13;
            } else {
                g22VarRememberLazyListState = g22Var;
            }
            i3 |= i13;
        } else {
            g22VarRememberLazyListState = g22Var;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                hs2Var2 = hs2Var;
                i3 |= kk0Var2.h(hs2Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (kk0Var2.i(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        elVar2 = elVar;
                        if (kk0Var2.h(elVar2)) {
                            i11 = 16384;
                        }
                        i3 |= i11;
                    } else {
                        elVar2 = elVar;
                    }
                    i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i11;
                } else {
                    elVar2 = elVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        z7Var2 = z7Var;
                        if (kk0Var2.h(z7Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            w71Var2 = w71Var;
                            int i15 = kk0Var2.h(w71Var2) ? 1048576 : 524288;
                            i3 |= i15;
                        } else {
                            w71Var2 = w71Var;
                        }
                        i3 |= i15;
                    } else {
                        w71Var2 = w71Var;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.j(le1Var)) {
                                i8 = 8388608;
                            } else {
                                i8 = 4194304;
                            }
                            i3 |= i8;
                        }
                        i9 = i3;
                        if ((i3 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var2.S(i9 & 1, z3)) {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i12 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar;
                                }
                                if ((i2 & 2) != 0) {
                                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                    i9 &= -113;
                                }
                                if (i14 != 0) {
                                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    is2Var = hs2Var2;
                                }
                                if (i4 != 0) {
                                    z2 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    if (z2) {
                                        clVar = hl.b;
                                    } else {
                                        clVar = hl.a;
                                    }
                                    elVar2 = clVar;
                                    i10 = i9 & (-57345);
                                } else {
                                    i10 = i9;
                                }
                                if (i6 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var2;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                } else {
                                    w71VarFlingBehavior = w71Var2;
                                }
                                z7Var4 = top;
                            } else {
                                kk0Var2.V();
                                i10 = (i2 & 2) != 0 ? i9 & (-113) : i9;
                                if ((i2 & 16) != 0) {
                                    i10 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                }
                                g22VarRememberLazyListState = g22VarRememberLazyListState;
                                elVar2 = elVar2;
                                w71VarFlingBehavior = w71Var2;
                                cVar3 = cVar;
                                z2 = z2;
                                z7Var4 = z7Var2;
                                is2Var = hs2Var2;
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                            cVar2 = cVar3;
                            g22Var2 = g22VarRememberLazyListState;
                            hs2Var3 = is2Var;
                            z4 = z2;
                            elVar3 = elVar2;
                            z7Var3 = z7Var4;
                            w71Var3 = w71VarFlingBehavior;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            g22Var2 = g22VarRememberLazyListState;
                            hs2Var3 = hs2Var2;
                            z4 = z2;
                            elVar3 = elVar2;
                            z7Var3 = z7Var2;
                            w71Var3 = w71Var2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                        }
                    }
                    i3 |= 12582912;
                    i9 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    clVar = hl.a;
                                } else {
                                    clVar = hl.b;
                                }
                                elVar2 = clVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            z7Var4 = top;
                        } else {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    clVar = hl.a;
                                } else {
                                    clVar = hl.b;
                                }
                                elVar2 = clVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            z7Var4 = top;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                        cVar2 = cVar3;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = is2Var;
                        z4 = z2;
                        elVar3 = elVar2;
                        z7Var3 = z7Var4;
                        w71Var3 = w71VarFlingBehavior;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z4 = z2;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                    }
                }
                i3 |= 196608;
                z7Var2 = z7Var;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    i9 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    clVar = hl.a;
                                } else {
                                    clVar = hl.b;
                                }
                                elVar2 = clVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            z7Var4 = top;
                        } else {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    clVar = hl.a;
                                } else {
                                    clVar = hl.b;
                                }
                                elVar2 = clVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            z7Var4 = top;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                        cVar2 = cVar3;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = is2Var;
                        z4 = z2;
                        elVar3 = elVar2;
                        z7Var3 = z7Var4;
                        w71Var3 = w71VarFlingBehavior;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z4 = z2;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                    }
                }
                i3 |= 12582912;
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    elVar2 = elVar;
                    if (kk0Var2.h(elVar2)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    elVar2 = elVar;
                }
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i11;
            } else {
                elVar2 = elVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z7Var2 = z7Var;
                    if (kk0Var2.h(z7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    i9 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    clVar = hl.a;
                                } else {
                                    clVar = hl.b;
                                }
                                elVar2 = clVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            z7Var4 = top;
                        } else {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    clVar = hl.a;
                                } else {
                                    clVar = hl.b;
                                }
                                elVar2 = clVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            z7Var4 = top;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                        cVar2 = cVar3;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = is2Var;
                        z4 = z2;
                        elVar3 = elVar2;
                        z7Var3 = z7Var4;
                        w71Var3 = w71VarFlingBehavior;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z4 = z2;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                    }
                }
                i3 |= 12582912;
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                }
            }
            i3 |= 196608;
            z7Var2 = z7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i15;
            } else {
                w71Var2 = w71Var;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                }
            }
            i3 |= 12582912;
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            clVar = hl.a;
                        } else {
                            clVar = hl.b;
                        }
                        elVar2 = clVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    z7Var4 = top;
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            clVar = hl.a;
                        } else {
                            clVar = hl.b;
                        }
                        elVar2 = clVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    z7Var4 = top;
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                cVar2 = cVar3;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = is2Var;
                z4 = z2;
                elVar3 = elVar2;
                z7Var3 = z7Var4;
                w71Var3 = w71VarFlingBehavior;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z4 = z2;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
            }
        }
        i3 |= 384;
        hs2Var2 = hs2Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (kk0Var2.i(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    elVar2 = elVar;
                    if (kk0Var2.h(elVar2)) {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    elVar2 = elVar;
                }
                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i11;
            } else {
                elVar2 = elVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z7Var2 = z7Var;
                    if (kk0Var2.h(z7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i15;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    i9 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    clVar = hl.a;
                                } else {
                                    clVar = hl.b;
                                }
                                elVar2 = clVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            z7Var4 = top;
                        } else {
                            if (i12 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i9 &= -113;
                            }
                            if (i14 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z2) {
                                    clVar = hl.a;
                                } else {
                                    clVar = hl.b;
                                }
                                elVar2 = clVar;
                                i10 = i9 & (-57345);
                            } else {
                                i10 = i9;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            z7Var4 = top;
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                        cVar2 = cVar3;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = is2Var;
                        z4 = z2;
                        elVar3 = elVar2;
                        z7Var3 = z7Var4;
                        w71Var3 = w71VarFlingBehavior;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z4 = z2;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                    }
                }
                i3 |= 12582912;
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                }
            }
            i3 |= 196608;
            z7Var2 = z7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i15;
            } else {
                w71Var2 = w71Var;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                }
            }
            i3 |= 12582912;
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            clVar = hl.a;
                        } else {
                            clVar = hl.b;
                        }
                        elVar2 = clVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    z7Var4 = top;
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            clVar = hl.a;
                        } else {
                            clVar = hl.b;
                        }
                        elVar2 = clVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    z7Var4 = top;
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                cVar2 = cVar3;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = is2Var;
                z4 = z2;
                elVar3 = elVar2;
                z7Var3 = z7Var4;
                w71Var3 = w71VarFlingBehavior;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z4 = z2;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                elVar2 = elVar;
                if (kk0Var2.h(elVar2)) {
                    i11 = 16384;
                }
                i3 |= i11;
            } else {
                elVar2 = elVar;
            }
            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i11;
        } else {
            elVar2 = elVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                z7Var2 = z7Var;
                if (kk0Var2.h(z7Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i15;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i15;
            } else {
                w71Var2 = w71Var;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    } else {
                        if (i12 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i9 &= -113;
                        }
                        if (i14 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z2) {
                                clVar = hl.a;
                            } else {
                                clVar = hl.b;
                            }
                            elVar2 = clVar;
                            i10 = i9 & (-57345);
                        } else {
                            i10 = i9;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            i10 &= -3670017;
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        z7Var4 = top;
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                    cVar2 = cVar3;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = is2Var;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var4;
                    w71Var3 = w71VarFlingBehavior;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z4 = z2;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
                }
            }
            i3 |= 12582912;
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            clVar = hl.a;
                        } else {
                            clVar = hl.b;
                        }
                        elVar2 = clVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    z7Var4 = top;
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            clVar = hl.a;
                        } else {
                            clVar = hl.b;
                        }
                        elVar2 = clVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    z7Var4 = top;
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                cVar2 = cVar3;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = is2Var;
                z4 = z2;
                elVar3 = elVar2;
                z7Var3 = z7Var4;
                w71Var3 = w71VarFlingBehavior;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z4 = z2;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
            }
        }
        i3 |= 196608;
        z7Var2 = z7Var;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                w71Var2 = w71Var;
                if (kk0Var2.h(w71Var2)) {
                }
                i3 |= i15;
            } else {
                w71Var2 = w71Var;
            }
            i3 |= i15;
        } else {
            w71Var2 = w71Var;
        }
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            if ((i & 12582912) == 0) {
                if (kk0Var2.j(le1Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            i9 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            clVar = hl.a;
                        } else {
                            clVar = hl.b;
                        }
                        elVar2 = clVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    z7Var4 = top;
                } else {
                    if (i12 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i9 &= -113;
                    }
                    if (i14 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            clVar = hl.a;
                        } else {
                            clVar = hl.b;
                        }
                        elVar2 = clVar;
                        i10 = i9 & (-57345);
                    } else {
                        i10 = i9;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i10 &= -3670017;
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    z7Var4 = top;
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
                cVar2 = cVar3;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = is2Var;
                z4 = z2;
                elVar3 = elVar2;
                z7Var3 = z7Var4;
                w71Var3 = w71VarFlingBehavior;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z4 = z2;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
            }
        }
        i3 |= 12582912;
        i9 = i3;
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var2.S(i9 & 1, z3)) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i9 &= -113;
                }
                if (i14 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z2) {
                        clVar = hl.a;
                    } else {
                        clVar = hl.b;
                    }
                    elVar2 = clVar;
                    i10 = i9 & (-57345);
                } else {
                    i10 = i9;
                }
                if (i6 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                if ((i2 & 64) != 0) {
                    i10 &= -3670017;
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                } else {
                    w71VarFlingBehavior = w71Var2;
                }
                z7Var4 = top;
            } else {
                if (i12 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i9 &= -113;
                }
                if (i14 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z2) {
                        clVar = hl.a;
                    } else {
                        clVar = hl.b;
                    }
                    elVar2 = clVar;
                    i10 = i9 & (-57345);
                } else {
                    i10 = i9;
                }
                if (i6 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                if ((i2 & 64) != 0) {
                    i10 &= -3670017;
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                } else {
                    w71VarFlingBehavior = w71Var2;
                }
                z7Var4 = top;
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            LazyRow(cVar3, g22VarRememberLazyListState, is2Var, z2, elVar2, z7Var4, w71VarFlingBehavior, true, null, le1Var, kk0Var, 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | ((i10 << 6) & 1879048192), FontInfo.NUMBER_OF_CHAR_CODES);
            cVar2 = cVar3;
            g22Var2 = g22VarRememberLazyListState;
            hs2Var3 = is2Var;
            z4 = z2;
            elVar3 = elVar2;
            z7Var3 = z7Var4;
            w71Var3 = w71VarFlingBehavior;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            g22Var2 = g22VarRememberLazyListState;
            hs2Var3 = hs2Var2;
            z4 = z2;
            elVar3 = elVar2;
            z7Var3 = z7Var2;
            w71Var3 = w71Var2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ol1(cVar2, g22Var2, hs2Var3, z4, elVar3, z7Var3, w71Var3, le1Var, i, i2, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:121:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:128:0x017a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x018b  */
    /* JADX WARN: Code duplicated, block: B:136:0x018e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0193  */
    /* JADX WARN: Code duplicated, block: B:140:0x0196  */
    /* JADX WARN: Code duplicated, block: B:141:0x019b  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:147:0x01af  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x0208  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
    @cv0
    public static final void LazyRow(c cVar, g22 g22Var, hs2 hs2Var, boolean z, el elVar, z7 z7Var, w71 w71Var, boolean z2, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        g22 g22VarRememberLazyListState;
        hs2 hs2Var2;
        int i4;
        boolean z3;
        int i5;
        el elVar2;
        int i6;
        z7 z7Var2;
        int i7;
        w71 w71Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        kk0 kk0Var;
        c cVar2;
        g22 g22Var2;
        hs2 hs2Var3;
        boolean z5;
        el elVar3;
        z7 z7Var3;
        w71 w71Var3;
        boolean z6;
        w33 w33VarV;
        c cVar3;
        hs2 is2Var;
        el elVar4;
        z7 top;
        w71 w71VarFlingBehavior;
        boolean z7;
        c cVar4;
        g22 g22Var3;
        hs2 hs2Var4;
        z7 z7Var4;
        boolean z8;
        w71 w71Var4;
        int i13;
        el elVar5;
        int i14;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1724297413);
        int i15 = i2 & 1;
        if (i15 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                g22VarRememberLazyListState = g22Var;
                int i16 = kk0Var2.h(g22VarRememberLazyListState) ? 32 : 16;
                i3 |= i16;
            } else {
                g22VarRememberLazyListState = g22Var;
            }
            i3 |= i16;
        } else {
            g22VarRememberLazyListState = g22Var;
        }
        int i17 = i2 & 4;
        if (i17 == 0) {
            if ((i & 384) == 0) {
                hs2Var2 = hs2Var;
                i3 |= kk0Var2.h(hs2Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (kk0Var2.i(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        elVar2 = elVar;
                        if (kk0Var2.h(elVar2)) {
                            i14 = 16384;
                        }
                        i3 |= i14;
                    } else {
                        elVar2 = elVar;
                    }
                    i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i14;
                } else {
                    elVar2 = elVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        z7Var2 = z7Var;
                        if (kk0Var2.h(z7Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            w71Var2 = w71Var;
                            int i18 = kk0Var2.h(w71Var2) ? 1048576 : 524288;
                            i3 |= i18;
                        } else {
                            w71Var2 = w71Var;
                        }
                        i3 |= i18;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i8 = i2 & Uuid.SIZE_BITS;
                    if (i8 != 0) {
                        i3 |= 12582912;
                        i9 = i15;
                    } else {
                        i9 = i15;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.i(z2)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        if ((i & 100663296) == 0) {
                            if (kk0Var2.j(le1Var)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (kk0Var2.S(i12 & 1, z4)) {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i9 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar;
                                }
                                if ((i2 & 2) != 0) {
                                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                    i12 &= -113;
                                }
                                if (i17 != 0) {
                                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    is2Var = hs2Var2;
                                }
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    if (z3) {
                                        elVar4 = hl.b;
                                    } else {
                                        elVar4 = hl.a;
                                    }
                                    i12 &= -57345;
                                } else {
                                    elVar4 = elVar2;
                                }
                                if (i6 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var2;
                                }
                                if ((i2 & 64) != 0) {
                                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                    i12 &= -3670017;
                                } else {
                                    w71VarFlingBehavior = w71Var2;
                                }
                                if (i8 != 0) {
                                    cVar4 = cVar3;
                                    g22Var3 = g22VarRememberLazyListState;
                                    hs2Var4 = is2Var;
                                    z8 = z3;
                                    w71Var4 = w71VarFlingBehavior;
                                    i13 = i12;
                                    z7 = true;
                                    elVar5 = elVar4;
                                    z7Var4 = top;
                                } else {
                                    z7 = z2;
                                    cVar4 = cVar3;
                                    g22Var3 = g22VarRememberLazyListState;
                                    hs2Var4 = is2Var;
                                    z7Var4 = top;
                                    z8 = z3;
                                    w71Var4 = w71VarFlingBehavior;
                                    i13 = i12;
                                    elVar5 = elVar4;
                                }
                            } else {
                                kk0Var2.V();
                                if ((i2 & 2) != 0) {
                                    i12 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                cVar4 = cVar;
                                z7 = z2;
                                z8 = z3;
                                z7Var4 = z7Var2;
                                w71Var4 = w71Var2;
                                i13 = i12;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = hs2Var2;
                                elVar5 = elVar2;
                            }
                            kk0Var2.s();
                            kk0Var = kk0Var2;
                            LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                            cVar2 = cVar4;
                            g22Var2 = g22Var3;
                            hs2Var3 = hs2Var4;
                            z5 = z8;
                            elVar3 = elVar5;
                            z7Var3 = z7Var4;
                            w71Var3 = w71Var4;
                            z6 = z7;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            g22Var2 = g22VarRememberLazyListState;
                            hs2Var3 = hs2Var2;
                            z5 = z3;
                            elVar3 = elVar2;
                            z7Var3 = z7Var2;
                            w71Var3 = w71Var2;
                            z6 = z2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                        }
                    }
                    i3 |= 100663296;
                    i12 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                elVar5 = elVar4;
                                z7Var4 = top;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                elVar5 = elVar4;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                elVar5 = elVar4;
                                z7Var4 = top;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                elVar5 = elVar4;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        elVar3 = elVar5;
                        z7Var3 = z7Var4;
                        w71Var3 = w71Var4;
                        z6 = z7;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                    }
                }
                i3 |= 196608;
                z7Var2 = z7Var;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i15;
                } else {
                    i9 = i15;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                elVar5 = elVar4;
                                z7Var4 = top;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                elVar5 = elVar4;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                elVar5 = elVar4;
                                z7Var4 = top;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                elVar5 = elVar4;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        elVar3 = elVar5;
                        z7Var3 = z7Var4;
                        w71Var3 = w71Var4;
                        z6 = z7;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                    }
                }
                i3 |= 100663296;
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    elVar3 = elVar5;
                    z7Var3 = z7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    elVar2 = elVar;
                    if (kk0Var2.h(elVar2)) {
                        i14 = 16384;
                    }
                    i3 |= i14;
                } else {
                    elVar2 = elVar;
                }
                i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i14;
            } else {
                elVar2 = elVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z7Var2 = z7Var;
                    if (kk0Var2.h(z7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i15;
                } else {
                    i9 = i15;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                elVar5 = elVar4;
                                z7Var4 = top;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                elVar5 = elVar4;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                elVar5 = elVar4;
                                z7Var4 = top;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                elVar5 = elVar4;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        elVar3 = elVar5;
                        z7Var3 = z7Var4;
                        w71Var3 = w71Var4;
                        z6 = z7;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                    }
                }
                i3 |= 100663296;
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    elVar3 = elVar5;
                    z7Var3 = z7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                }
            }
            i3 |= 196608;
            z7Var2 = z7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i18;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i15;
            } else {
                i9 = i15;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    elVar3 = elVar5;
                    z7Var3 = z7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                }
            }
            i3 |= 100663296;
            i12 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        elVar5 = elVar4;
                        z7Var4 = top;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        elVar5 = elVar4;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        elVar5 = elVar4;
                        z7Var4 = top;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        elVar5 = elVar4;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                elVar3 = elVar5;
                z7Var3 = z7Var4;
                w71Var3 = w71Var4;
                z6 = z7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
            }
        }
        i3 |= 384;
        hs2Var2 = hs2Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (kk0Var2.i(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    elVar2 = elVar;
                    if (kk0Var2.h(elVar2)) {
                        i14 = 16384;
                    }
                    i3 |= i14;
                } else {
                    elVar2 = elVar;
                }
                i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i14;
            } else {
                elVar2 = elVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z7Var2 = z7Var;
                    if (kk0Var2.h(z7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i18;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i15;
                } else {
                    i9 = i15;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    if ((i & 100663296) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                elVar5 = elVar4;
                                z7Var4 = top;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                elVar5 = elVar4;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i17 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i12 &= -3670017;
                            } else {
                                w71VarFlingBehavior = w71Var2;
                            }
                            if (i8 != 0) {
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                z7 = true;
                                elVar5 = elVar4;
                                z7Var4 = top;
                            } else {
                                z7 = z2;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i13 = i12;
                                elVar5 = elVar4;
                            }
                        }
                        kk0Var2.s();
                        kk0Var = kk0Var2;
                        LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        elVar3 = elVar5;
                        z7Var3 = z7Var4;
                        w71Var3 = w71Var4;
                        z6 = z7;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                    }
                }
                i3 |= 100663296;
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    elVar3 = elVar5;
                    z7Var3 = z7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                }
            }
            i3 |= 196608;
            z7Var2 = z7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i18;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i15;
            } else {
                i9 = i15;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    elVar3 = elVar5;
                    z7Var3 = z7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                }
            }
            i3 |= 100663296;
            i12 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        elVar5 = elVar4;
                        z7Var4 = top;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        elVar5 = elVar4;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        elVar5 = elVar4;
                        z7Var4 = top;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        elVar5 = elVar4;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                elVar3 = elVar5;
                z7Var3 = z7Var4;
                w71Var3 = w71Var4;
                z6 = z7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                elVar2 = elVar;
                if (kk0Var2.h(elVar2)) {
                    i14 = 16384;
                }
                i3 |= i14;
            } else {
                elVar2 = elVar;
            }
            i14 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i14;
        } else {
            elVar2 = elVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                z7Var2 = z7Var;
                if (kk0Var2.h(z7Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i18;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i18;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i15;
            } else {
                i9 = i15;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                if ((i & 100663296) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i17 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i12 &= -3670017;
                        } else {
                            w71VarFlingBehavior = w71Var2;
                        }
                        if (i8 != 0) {
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            z7 = true;
                            elVar5 = elVar4;
                            z7Var4 = top;
                        } else {
                            z7 = z2;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i13 = i12;
                            elVar5 = elVar4;
                        }
                    }
                    kk0Var2.s();
                    kk0Var = kk0Var2;
                    LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    elVar3 = elVar5;
                    z7Var3 = z7Var4;
                    w71Var3 = w71Var4;
                    z6 = z7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
                }
            }
            i3 |= 100663296;
            i12 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        elVar5 = elVar4;
                        z7Var4 = top;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        elVar5 = elVar4;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        elVar5 = elVar4;
                        z7Var4 = top;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        elVar5 = elVar4;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                elVar3 = elVar5;
                z7Var3 = z7Var4;
                w71Var3 = w71Var4;
                z6 = z7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
            }
        }
        i3 |= 196608;
        z7Var2 = z7Var;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                w71Var2 = w71Var;
                if (kk0Var2.h(w71Var2)) {
                }
                i3 |= i18;
            } else {
                w71Var2 = w71Var;
            }
            i3 |= i18;
        } else {
            w71Var2 = w71Var;
        }
        i8 = i2 & Uuid.SIZE_BITS;
        if (i8 != 0) {
            i3 |= 12582912;
            i9 = i15;
        } else {
            i9 = i15;
            if ((i & 12582912) == 0) {
                if (kk0Var2.i(z2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
        }
        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            if ((i & 100663296) == 0) {
                if (kk0Var2.j(le1Var)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        elVar5 = elVar4;
                        z7Var4 = top;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        elVar5 = elVar4;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i17 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i12 &= -3670017;
                    } else {
                        w71VarFlingBehavior = w71Var2;
                    }
                    if (i8 != 0) {
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        z7 = true;
                        elVar5 = elVar4;
                        z7Var4 = top;
                    } else {
                        z7 = z2;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i13 = i12;
                        elVar5 = elVar4;
                    }
                }
                kk0Var2.s();
                kk0Var = kk0Var2;
                LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                elVar3 = elVar5;
                z7Var3 = z7Var4;
                w71Var3 = w71Var4;
                z6 = z7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
            }
        }
        i3 |= 100663296;
        i12 = i3;
        if ((i3 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (kk0Var2.S(i12 & 1, z4)) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i12 &= -113;
                }
                if (i17 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z3) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = hl.b;
                    }
                    i12 &= -57345;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                if ((i2 & 64) != 0) {
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    i12 &= -3670017;
                } else {
                    w71VarFlingBehavior = w71Var2;
                }
                if (i8 != 0) {
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i13 = i12;
                    z7 = true;
                    elVar5 = elVar4;
                    z7Var4 = top;
                } else {
                    z7 = z2;
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    z7Var4 = top;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i13 = i12;
                    elVar5 = elVar4;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i12 &= -113;
                }
                if (i17 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z3) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = hl.b;
                    }
                    i12 &= -57345;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                if ((i2 & 64) != 0) {
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    i12 &= -3670017;
                } else {
                    w71VarFlingBehavior = w71Var2;
                }
                if (i8 != 0) {
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i13 = i12;
                    z7 = true;
                    elVar5 = elVar4;
                    z7Var4 = top;
                } else {
                    z7 = z2;
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    z7Var4 = top;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i13 = i12;
                    elVar5 = elVar4;
                }
            }
            kk0Var2.s();
            kk0Var = kk0Var2;
            LazyRow(cVar4, g22Var3, hs2Var4, z8, elVar5, z7Var4, w71Var4, z7, rr2.rememberOverscrollEffect(kk0Var2, 0), le1Var, kk0Var, (33554430 & i13) | ((i13 << 3) & 1879048192), 0);
            cVar2 = cVar4;
            g22Var2 = g22Var3;
            hs2Var3 = hs2Var4;
            z5 = z8;
            elVar3 = elVar5;
            z7Var3 = z7Var4;
            w71Var3 = w71Var4;
            z6 = z7;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            g22Var2 = g22VarRememberLazyListState;
            hs2Var3 = hs2Var2;
            z5 = z3;
            elVar3 = elVar2;
            z7Var3 = z7Var2;
            w71Var3 = w71Var2;
            z6 = z2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ql1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, le1Var, i, i2, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:104:0x011a  */
    /* JADX WARN: Code duplicated, block: B:106:0x011e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x0129  */
    /* JADX WARN: Code duplicated, block: B:113:0x013c  */
    /* JADX WARN: Code duplicated, block: B:114:0x013f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0148  */
    /* JADX WARN: Code duplicated, block: B:119:0x0158  */
    /* JADX WARN: Code duplicated, block: B:136:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0190  */
    /* JADX WARN: Code duplicated, block: B:138:0x0193  */
    /* JADX WARN: Code duplicated, block: B:141:0x0199  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01be  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:166:0x01de  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0253  */
    /* JADX WARN: Code duplicated, block: B:172:0x026a  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    public static final void LazyRow(c cVar, g22 g22Var, hs2 hs2Var, boolean z, el elVar, z7 z7Var, w71 w71Var, boolean z2, pr2 pr2Var, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        g22 g22VarRememberLazyListState;
        hs2 hs2Var2;
        int i4;
        boolean z3;
        int i5;
        el elVar2;
        int i6;
        z7 z7Var2;
        int i7;
        w71 w71Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        kk0 kk0Var;
        c cVar2;
        g22 g22Var2;
        hs2 hs2Var3;
        boolean z5;
        el elVar3;
        z7 z7Var3;
        w71 w71Var3;
        boolean z6;
        pr2 pr2Var2;
        w33 w33VarV;
        c cVar3;
        hs2 is2Var;
        el elVar4;
        z7 top;
        w71 w71VarFlingBehavior;
        int i13;
        boolean z7;
        pr2 pr2VarRememberOverscrollEffect;
        c cVar4;
        g22 g22Var3;
        hs2 hs2Var4;
        el elVar5;
        z7 z7Var4;
        boolean z8;
        w71 w71Var4;
        int i14;
        boolean z9;
        int i15;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1884325601);
        int i16 = i2 & 1;
        if (i16 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                g22VarRememberLazyListState = g22Var;
                int i17 = kk0Var2.h(g22VarRememberLazyListState) ? 32 : 16;
                i3 |= i17;
            } else {
                g22VarRememberLazyListState = g22Var;
            }
            i3 |= i17;
        } else {
            g22VarRememberLazyListState = g22Var;
        }
        int i18 = i2 & 4;
        if (i18 == 0) {
            if ((i & 384) == 0) {
                hs2Var2 = hs2Var;
                i3 |= kk0Var2.h(hs2Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (kk0Var2.i(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        elVar2 = elVar;
                        if (kk0Var2.h(elVar2)) {
                            i15 = 16384;
                        }
                        i3 |= i15;
                    } else {
                        elVar2 = elVar;
                    }
                    i15 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i15;
                } else {
                    elVar2 = elVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        z7Var2 = z7Var;
                        if (kk0Var2.h(z7Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            w71Var2 = w71Var;
                            int i19 = kk0Var2.h(w71Var2) ? 1048576 : 524288;
                            i3 |= i19;
                        } else {
                            w71Var2 = w71Var;
                        }
                        i3 |= i19;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i8 = i2 & Uuid.SIZE_BITS;
                    if (i8 != 0) {
                        i3 |= 12582912;
                        i9 = i16;
                    } else {
                        i9 = i16;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.i(z2)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((i & 805306368) == 0) {
                            if (kk0Var2.j(le1Var)) {
                                i11 = 536870912;
                            } else {
                                i11 = 268435456;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (kk0Var2.S(i12 & 1, z4)) {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i9 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar;
                                }
                                if ((i2 & 2) != 0) {
                                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                    i12 &= -113;
                                }
                                if (i18 != 0) {
                                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    is2Var = hs2Var2;
                                }
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    if (z3) {
                                        elVar4 = hl.b;
                                    } else {
                                        elVar4 = hl.a;
                                    }
                                    i12 &= -57345;
                                } else {
                                    elVar4 = elVar2;
                                }
                                if (i6 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var2;
                                }
                                if ((i2 & 64) != 0) {
                                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                    i13 = i12 & (-3670017);
                                } else {
                                    w71VarFlingBehavior = w71Var2;
                                    i13 = i12;
                                }
                                z7 = i8 == 0 ? z2 : true;
                                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    cVar4 = cVar3;
                                    pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                    g22Var3 = g22VarRememberLazyListState;
                                    hs2Var4 = is2Var;
                                    elVar5 = elVar4;
                                    z7Var4 = top;
                                    z8 = z3;
                                    w71Var4 = w71VarFlingBehavior;
                                    z9 = z7;
                                    i14 = (-234881025) & i13;
                                } else {
                                    pr2VarRememberOverscrollEffect = pr2Var;
                                    cVar4 = cVar3;
                                    g22Var3 = g22VarRememberLazyListState;
                                    hs2Var4 = is2Var;
                                    elVar5 = elVar4;
                                    z7Var4 = top;
                                    z8 = z3;
                                    w71Var4 = w71VarFlingBehavior;
                                    i14 = i13;
                                    z9 = z7;
                                }
                            } else {
                                kk0Var2.V();
                                i14 = (i2 & 2) != 0 ? i12 & (-113) : i12;
                                if ((i2 & 16) != 0) {
                                    i14 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i14 &= -3670017;
                                }
                                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i14 &= -234881025;
                                }
                                z9 = z2;
                                pr2VarRememberOverscrollEffect = pr2Var;
                                hs2Var4 = hs2Var2;
                                z8 = z3;
                                elVar5 = elVar2;
                                z7Var4 = z7Var2;
                                w71Var4 = w71Var2;
                                cVar4 = cVar;
                                g22Var3 = g22VarRememberLazyListState;
                            }
                            kk0Var2.s();
                            int i20 = i14 >> 3;
                            kk0Var = kk0Var2;
                            y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i20) | (3670016 & i20) | (i20 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                            cVar2 = cVar4;
                            g22Var2 = g22Var3;
                            hs2Var3 = hs2Var4;
                            z5 = z8;
                            w71Var3 = w71Var4;
                            z6 = z9;
                            pr2Var2 = pr2VarRememberOverscrollEffect;
                            z7Var3 = z7Var4;
                            elVar3 = elVar5;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            g22Var2 = g22VarRememberLazyListState;
                            hs2Var3 = hs2Var2;
                            z5 = z3;
                            elVar3 = elVar2;
                            z7Var3 = z7Var2;
                            w71Var3 = w71Var2;
                            z6 = z2;
                            pr2Var2 = pr2Var;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                        }
                    }
                    i3 |= 805306368;
                    i12 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        }
                        kk0Var2.s();
                        int i21 = i14 >> 3;
                        kk0Var = kk0Var2;
                        y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        w71Var3 = w71Var4;
                        z6 = z9;
                        pr2Var2 = pr2VarRememberOverscrollEffect;
                        z7Var3 = z7Var4;
                        elVar3 = elVar5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                        pr2Var2 = pr2Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                z7Var2 = z7Var;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i19;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i16;
                } else {
                    i9 = i16;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        }
                        kk0Var2.s();
                        int i22 = i14 >> 3;
                        kk0Var = kk0Var2;
                        y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i22) | (3670016 & i22) | (i22 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        w71Var3 = w71Var4;
                        z6 = z9;
                        pr2Var2 = pr2VarRememberOverscrollEffect;
                        z7Var3 = z7Var4;
                        elVar3 = elVar5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                        pr2Var2 = pr2Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                    }
                }
                i3 |= 805306368;
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i23 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i23) | (3670016 & i23) | (i23 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    z7Var3 = z7Var4;
                    elVar3 = elVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    elVar2 = elVar;
                    if (kk0Var2.h(elVar2)) {
                        i15 = 16384;
                    }
                    i3 |= i15;
                } else {
                    elVar2 = elVar;
                }
                i15 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i15;
            } else {
                elVar2 = elVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z7Var2 = z7Var;
                    if (kk0Var2.h(z7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i19;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i16;
                } else {
                    i9 = i16;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        }
                        kk0Var2.s();
                        int i24 = i14 >> 3;
                        kk0Var = kk0Var2;
                        y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i24) | (3670016 & i24) | (i24 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        w71Var3 = w71Var4;
                        z6 = z9;
                        pr2Var2 = pr2VarRememberOverscrollEffect;
                        z7Var3 = z7Var4;
                        elVar3 = elVar5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                        pr2Var2 = pr2Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                    }
                }
                i3 |= 805306368;
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i25 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    z7Var3 = z7Var4;
                    elVar3 = elVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            z7Var2 = z7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i19;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i16;
            } else {
                i9 = i16;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i26 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    z7Var3 = z7Var4;
                    elVar3 = elVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                }
            }
            i3 |= 805306368;
            i12 = i3;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                }
                kk0Var2.s();
                int i27 = i14 >> 3;
                kk0Var = kk0Var2;
                y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                w71Var3 = w71Var4;
                z6 = z9;
                pr2Var2 = pr2VarRememberOverscrollEffect;
                z7Var3 = z7Var4;
                elVar3 = elVar5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
                pr2Var2 = pr2Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
            }
        }
        i3 |= 384;
        hs2Var2 = hs2Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (kk0Var2.i(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    elVar2 = elVar;
                    if (kk0Var2.h(elVar2)) {
                        i15 = 16384;
                    }
                    i3 |= i15;
                } else {
                    elVar2 = elVar;
                }
                i15 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i15;
            } else {
                elVar2 = elVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z7Var2 = z7Var;
                    if (kk0Var2.h(z7Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w71Var2 = w71Var;
                        if (kk0Var2.h(w71Var2)) {
                        }
                        i3 |= i19;
                    } else {
                        w71Var2 = w71Var;
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i8 = i2 & Uuid.SIZE_BITS;
                if (i8 != 0) {
                    i3 |= 12582912;
                    i9 = i16;
                } else {
                    i9 = i16;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.i(z2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(le1Var)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kk0Var2.S(i12 & 1, z4)) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        } else {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar;
                            }
                            if ((i2 & 2) != 0) {
                                g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                                i12 &= -113;
                            }
                            if (i18 != 0) {
                                is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                is2Var = hs2Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                if (z3) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = hl.b;
                                }
                                i12 &= -57345;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            if ((i2 & 64) != 0) {
                                w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                                i13 = i12 & (-3670017);
                            } else {
                                w71VarFlingBehavior = w71Var2;
                                i13 = i12;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                cVar4 = cVar3;
                                pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                z9 = z7;
                                i14 = (-234881025) & i13;
                            } else {
                                pr2VarRememberOverscrollEffect = pr2Var;
                                cVar4 = cVar3;
                                g22Var3 = g22VarRememberLazyListState;
                                hs2Var4 = is2Var;
                                elVar5 = elVar4;
                                z7Var4 = top;
                                z8 = z3;
                                w71Var4 = w71VarFlingBehavior;
                                i14 = i13;
                                z9 = z7;
                            }
                        }
                        kk0Var2.s();
                        int i28 = i14 >> 3;
                        kk0Var = kk0Var2;
                        y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                        cVar2 = cVar4;
                        g22Var2 = g22Var3;
                        hs2Var3 = hs2Var4;
                        z5 = z8;
                        w71Var3 = w71Var4;
                        z6 = z9;
                        pr2Var2 = pr2VarRememberOverscrollEffect;
                        z7Var3 = z7Var4;
                        elVar3 = elVar5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        g22Var2 = g22VarRememberLazyListState;
                        hs2Var3 = hs2Var2;
                        z5 = z3;
                        elVar3 = elVar2;
                        z7Var3 = z7Var2;
                        w71Var3 = w71Var2;
                        z6 = z2;
                        pr2Var2 = pr2Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                    }
                }
                i3 |= 805306368;
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i29 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    z7Var3 = z7Var4;
                    elVar3 = elVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            z7Var2 = z7Var;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i19;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i16;
            } else {
                i9 = i16;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i210 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i210) | (3670016 & i210) | (i210 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    z7Var3 = z7Var4;
                    elVar3 = elVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                }
            }
            i3 |= 805306368;
            i12 = i3;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                }
                kk0Var2.s();
                int i211 = i14 >> 3;
                kk0Var = kk0Var2;
                y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i211) | (3670016 & i211) | (i211 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                w71Var3 = w71Var4;
                z6 = z9;
                pr2Var2 = pr2VarRememberOverscrollEffect;
                z7Var3 = z7Var4;
                elVar3 = elVar5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
                pr2Var2 = pr2Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                elVar2 = elVar;
                if (kk0Var2.h(elVar2)) {
                    i15 = 16384;
                }
                i3 |= i15;
            } else {
                elVar2 = elVar;
            }
            i15 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i15;
        } else {
            elVar2 = elVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                z7Var2 = z7Var;
                if (kk0Var2.h(z7Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    w71Var2 = w71Var;
                    if (kk0Var2.h(w71Var2)) {
                    }
                    i3 |= i19;
                } else {
                    w71Var2 = w71Var;
                }
                i3 |= i19;
            } else {
                w71Var2 = w71Var;
            }
            i8 = i2 & Uuid.SIZE_BITS;
            if (i8 != 0) {
                i3 |= 12582912;
                i9 = i16;
            } else {
                i9 = i16;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var2.S(i12 & 1, z4)) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar;
                        }
                        if ((i2 & 2) != 0) {
                            g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                            i12 &= -113;
                        }
                        if (i18 != 0) {
                            is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            is2Var = hs2Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            if (z3) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = hl.b;
                            }
                            i12 &= -57345;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        if ((i2 & 64) != 0) {
                            w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                            i13 = i12 & (-3670017);
                        } else {
                            w71VarFlingBehavior = w71Var2;
                            i13 = i12;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            cVar4 = cVar3;
                            pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            z9 = z7;
                            i14 = (-234881025) & i13;
                        } else {
                            pr2VarRememberOverscrollEffect = pr2Var;
                            cVar4 = cVar3;
                            g22Var3 = g22VarRememberLazyListState;
                            hs2Var4 = is2Var;
                            elVar5 = elVar4;
                            z7Var4 = top;
                            z8 = z3;
                            w71Var4 = w71VarFlingBehavior;
                            i14 = i13;
                            z9 = z7;
                        }
                    }
                    kk0Var2.s();
                    int i212 = i14 >> 3;
                    kk0Var = kk0Var2;
                    y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                    cVar2 = cVar4;
                    g22Var2 = g22Var3;
                    hs2Var3 = hs2Var4;
                    z5 = z8;
                    w71Var3 = w71Var4;
                    z6 = z9;
                    pr2Var2 = pr2VarRememberOverscrollEffect;
                    z7Var3 = z7Var4;
                    elVar3 = elVar5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    g22Var2 = g22VarRememberLazyListState;
                    hs2Var3 = hs2Var2;
                    z5 = z3;
                    elVar3 = elVar2;
                    z7Var3 = z7Var2;
                    w71Var3 = w71Var2;
                    z6 = z2;
                    pr2Var2 = pr2Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
                }
            }
            i3 |= 805306368;
            i12 = i3;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                }
                kk0Var2.s();
                int i213 = i14 >> 3;
                kk0Var = kk0Var2;
                y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i213) | (3670016 & i213) | (i213 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                w71Var3 = w71Var4;
                z6 = z9;
                pr2Var2 = pr2VarRememberOverscrollEffect;
                z7Var3 = z7Var4;
                elVar3 = elVar5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
                pr2Var2 = pr2Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
            }
        }
        i3 |= 196608;
        z7Var2 = z7Var;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                w71Var2 = w71Var;
                if (kk0Var2.h(w71Var2)) {
                }
                i3 |= i19;
            } else {
                w71Var2 = w71Var;
            }
            i3 |= i19;
        } else {
            w71Var2 = w71Var;
        }
        i8 = i2 & Uuid.SIZE_BITS;
        if (i8 != 0) {
            i3 |= 12582912;
            i9 = i16;
        } else {
            i9 = i16;
            if ((i & 12582912) == 0) {
                if (kk0Var2.i(z2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
        }
        if ((i & 100663296) != 0) {
            i3 |= ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var2.h(pr2Var)) ? 33554432 : 67108864;
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((i & 805306368) == 0) {
                if (kk0Var2.j(le1Var)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var2.S(i12 & 1, z4)) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar;
                    }
                    if ((i2 & 2) != 0) {
                        g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                        i12 &= -113;
                    }
                    if (i18 != 0) {
                        is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        is2Var = hs2Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        if (z3) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = hl.b;
                        }
                        i12 &= -57345;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    if ((i2 & 64) != 0) {
                        w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                        i13 = i12 & (-3670017);
                    } else {
                        w71VarFlingBehavior = w71Var2;
                        i13 = i12;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        cVar4 = cVar3;
                        pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        z9 = z7;
                        i14 = (-234881025) & i13;
                    } else {
                        pr2VarRememberOverscrollEffect = pr2Var;
                        cVar4 = cVar3;
                        g22Var3 = g22VarRememberLazyListState;
                        hs2Var4 = is2Var;
                        elVar5 = elVar4;
                        z7Var4 = top;
                        z8 = z3;
                        w71Var4 = w71VarFlingBehavior;
                        i14 = i13;
                        z9 = z7;
                    }
                }
                kk0Var2.s();
                int i214 = i14 >> 3;
                kk0Var = kk0Var2;
                y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i214) | (3670016 & i214) | (i214 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
                cVar2 = cVar4;
                g22Var2 = g22Var3;
                hs2Var3 = hs2Var4;
                z5 = z8;
                w71Var3 = w71Var4;
                z6 = z9;
                pr2Var2 = pr2VarRememberOverscrollEffect;
                z7Var3 = z7Var4;
                elVar3 = elVar5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                g22Var2 = g22VarRememberLazyListState;
                hs2Var3 = hs2Var2;
                z5 = z3;
                elVar3 = elVar2;
                z7Var3 = z7Var2;
                w71Var3 = w71Var2;
                z6 = z2;
                pr2Var2 = pr2Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
            }
        }
        i3 |= 805306368;
        i12 = i3;
        if ((i3 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (kk0Var2.S(i12 & 1, z4)) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i12 &= -113;
                }
                if (i18 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z3) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = hl.b;
                    }
                    i12 &= -57345;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                if ((i2 & 64) != 0) {
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    i13 = i12 & (-3670017);
                } else {
                    w71VarFlingBehavior = w71Var2;
                    i13 = i12;
                }
                if (i8 == 0) {
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    cVar4 = cVar3;
                    pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    elVar5 = elVar4;
                    z7Var4 = top;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    z9 = z7;
                    i14 = (-234881025) & i13;
                } else {
                    pr2VarRememberOverscrollEffect = pr2Var;
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    elVar5 = elVar4;
                    z7Var4 = top;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i14 = i13;
                    z9 = z7;
                }
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if ((i2 & 2) != 0) {
                    g22VarRememberLazyListState = h22.rememberLazyListState(0, 0, kk0Var2, 0, 3);
                    i12 &= -113;
                }
                if (i18 != 0) {
                    is2Var = new is2(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    is2Var = hs2Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    if (z3) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = hl.b;
                    }
                    i12 &= -57345;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                if ((i2 & 64) != 0) {
                    w71VarFlingBehavior = vb3.a.flingBehavior(kk0Var2, 6);
                    i13 = i12 & (-3670017);
                } else {
                    w71VarFlingBehavior = w71Var2;
                    i13 = i12;
                }
                if (i8 == 0) {
                }
                if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    cVar4 = cVar3;
                    pr2VarRememberOverscrollEffect = rr2.rememberOverscrollEffect(kk0Var2, 0);
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    elVar5 = elVar4;
                    z7Var4 = top;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    z9 = z7;
                    i14 = (-234881025) & i13;
                } else {
                    pr2VarRememberOverscrollEffect = pr2Var;
                    cVar4 = cVar3;
                    g22Var3 = g22VarRememberLazyListState;
                    hs2Var4 = is2Var;
                    elVar5 = elVar4;
                    z7Var4 = top;
                    z8 = z3;
                    w71Var4 = w71VarFlingBehavior;
                    i14 = i13;
                    z9 = z7;
                }
            }
            kk0Var2.s();
            int i215 = i14 >> 3;
            kk0Var = kk0Var2;
            y12.LazyList(cVar4, g22Var3, hs2Var4, z8, false, w71Var4, z9, pr2VarRememberOverscrollEffect, 0, null, null, z7Var4, elVar5, le1Var, kk0Var, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (458752 & i215) | (3670016 & i215) | (i215 & 29360128), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & 7168), 1792);
            cVar2 = cVar4;
            g22Var2 = g22Var3;
            hs2Var3 = hs2Var4;
            z5 = z8;
            w71Var3 = w71Var4;
            z6 = z9;
            pr2Var2 = pr2VarRememberOverscrollEffect;
            z7Var3 = z7Var4;
            elVar3 = elVar5;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            g22Var2 = g22VarRememberLazyListState;
            hs2Var3 = hs2Var2;
            z5 = z3;
            elVar3 = elVar2;
            z7Var3 = z7Var2;
            w71Var3 = w71Var2;
            z6 = z2;
            pr2Var2 = pr2Var;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new my1(cVar2, g22Var2, hs2Var3, z5, elVar3, z7Var3, w71Var3, z6, pr2Var2, le1Var, i, i2, 1));
        }
    }
}
