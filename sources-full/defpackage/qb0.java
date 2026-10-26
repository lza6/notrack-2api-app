package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.selection.b;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.c;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class qb0 {
    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x013c  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x00c5, please report this as an issue */
    public static final void Checkbox(boolean z, le1 le1Var, c cVar, boolean z2, jb0 jb0Var, gh2 gh2Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        boolean z3;
        int i5;
        jb0 jb0VarColors;
        int i6;
        gh2 gh2Var2;
        int i7;
        je1 je1Var;
        c cVar3;
        gh2 gh2Var3;
        c cVar4;
        e14 e14Var;
        c cVar5;
        boolean z4;
        jb0 jb0Var2;
        gh2 gh2Var4;
        boolean z5;
        boolean z6;
        Object objP;
        w33 w33VarV;
        int i8;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1406741137);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(le1Var) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
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
                        jb0VarColors = jb0Var;
                        if (kk0Var.h(jb0VarColors)) {
                            i8 = 16384;
                        }
                        i3 |= i8;
                    } else {
                        jb0VarColors = jb0Var;
                    }
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i8;
                } else {
                    jb0VarColors = jb0Var;
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
                    if ((74899 & i3) == 74898 || !kk0Var.F()) {
                        kk0Var.X();
                        je1Var = null;
                        if ((i & 1) != 0 || kk0Var.D()) {
                            if (i9 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                jb0VarColors = kb0.a.colors(kk0Var, 6);
                            }
                            if (i6 != 0) {
                                gh2Var3 = null;
                            } else {
                                gh2Var3 = gh2Var2;
                            }
                            cVar4 = cVar3;
                        } else {
                            kk0Var.V();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            z3 = z3;
                            gh2Var3 = gh2Var2;
                            jb0VarColors = jb0VarColors;
                            cVar4 = cVar2;
                        }
                        kk0Var.s();
                        if (z) {
                            e14Var = e14.c;
                        } else {
                            e14Var = e14.d;
                        }
                        e14 e14Var2 = e14Var;
                        kk0Var.a0(1046936362);
                        if (le1Var != null) {
                            if ((i3 & 112) == 32) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = z5 | ((i3 & 14) == 4);
                            objP = kk0Var.P();
                            if (z6 || objP == Composer$Companion.getEmpty()) {
                                objP = new lb0(0, le1Var, z);
                                kk0Var.l0(objP);
                            }
                            je1Var = (je1) objP;
                        }
                        kk0Var.r(false);
                        TriStateCheckbox(e14Var2, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                        cVar5 = cVar4;
                        z4 = z3;
                        jb0Var2 = jb0VarColors;
                        gh2Var4 = gh2Var3;
                    } else {
                        kk0Var.V();
                        cVar5 = cVar2;
                        z4 = z3;
                        jb0Var2 = jb0VarColors;
                        gh2Var4 = gh2Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new mb0(z, le1Var, cVar5, z4, jb0Var2, gh2Var4, i, i2));
                    }
                }
                i3 |= 196608;
                gh2Var2 = gh2Var;
                if ((74899 & i3) == 74898) {
                    kk0Var.X();
                    je1Var = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    if (z) {
                        e14Var = e14.c;
                    } else {
                        e14Var = e14.d;
                    }
                    e14 e14Var3 = e14Var;
                    kk0Var.a0(1046936362);
                    if (le1Var != null) {
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | ((i3 & 14) == 4);
                        objP = kk0Var.P();
                        if (z6) {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        } else {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        }
                        je1Var = (je1) objP;
                    }
                    kk0Var.r(false);
                    TriStateCheckbox(e14Var3, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                    cVar5 = cVar4;
                    z4 = z3;
                    jb0Var2 = jb0VarColors;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var.X();
                    je1Var = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    if (z) {
                        e14Var = e14.c;
                    } else {
                        e14Var = e14.d;
                    }
                    e14 e14Var4 = e14Var;
                    kk0Var.a0(1046936362);
                    if (le1Var != null) {
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | ((i3 & 14) == 4);
                        objP = kk0Var.P();
                        if (z6) {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        } else {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        }
                        je1Var = (je1) objP;
                    }
                    kk0Var.r(false);
                    TriStateCheckbox(e14Var4, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                    cVar5 = cVar4;
                    z4 = z3;
                    jb0Var2 = jb0VarColors;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new mb0(z, le1Var, cVar5, z4, jb0Var2, gh2Var4, i, i2));
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jb0VarColors = jb0Var;
                    if (kk0Var.h(jb0VarColors)) {
                        i8 = 16384;
                    }
                    i3 |= i8;
                } else {
                    jb0VarColors = jb0Var;
                }
                i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i8;
            } else {
                jb0VarColors = jb0Var;
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
                if ((74899 & i3) == 74898) {
                    kk0Var.X();
                    je1Var = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    if (z) {
                        e14Var = e14.c;
                    } else {
                        e14Var = e14.d;
                    }
                    e14 e14Var5 = e14Var;
                    kk0Var.a0(1046936362);
                    if (le1Var != null) {
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | ((i3 & 14) == 4);
                        objP = kk0Var.P();
                        if (z6) {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        } else {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        }
                        je1Var = (je1) objP;
                    }
                    kk0Var.r(false);
                    TriStateCheckbox(e14Var5, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                    cVar5 = cVar4;
                    z4 = z3;
                    jb0Var2 = jb0VarColors;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var.X();
                    je1Var = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    if (z) {
                        e14Var = e14.c;
                    } else {
                        e14Var = e14.d;
                    }
                    e14 e14Var6 = e14Var;
                    kk0Var.a0(1046936362);
                    if (le1Var != null) {
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | ((i3 & 14) == 4);
                        objP = kk0Var.P();
                        if (z6) {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        } else {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        }
                        je1Var = (je1) objP;
                    }
                    kk0Var.r(false);
                    TriStateCheckbox(e14Var6, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                    cVar5 = cVar4;
                    z4 = z3;
                    jb0Var2 = jb0VarColors;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new mb0(z, le1Var, cVar5, z4, jb0Var2, gh2Var4, i, i2));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
            if ((74899 & i3) == 74898) {
                kk0Var.X();
                je1Var = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                if (z) {
                    e14Var = e14.c;
                } else {
                    e14Var = e14.d;
                }
                e14 e14Var7 = e14Var;
                kk0Var.a0(1046936362);
                if (le1Var != null) {
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((i3 & 14) == 4);
                    objP = kk0Var.P();
                    if (z6) {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    } else {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    }
                    je1Var = (je1) objP;
                }
                kk0Var.r(false);
                TriStateCheckbox(e14Var7, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                cVar5 = cVar4;
                z4 = z3;
                jb0Var2 = jb0VarColors;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var.X();
                je1Var = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                if (z) {
                    e14Var = e14.c;
                } else {
                    e14Var = e14.d;
                }
                e14 e14Var8 = e14Var;
                kk0Var.a0(1046936362);
                if (le1Var != null) {
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((i3 & 14) == 4);
                    objP = kk0Var.P();
                    if (z6) {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    } else {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    }
                    je1Var = (je1) objP;
                }
                kk0Var.r(false);
                TriStateCheckbox(e14Var8, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                cVar5 = cVar4;
                z4 = z3;
                jb0Var2 = jb0VarColors;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new mb0(z, le1Var, cVar5, z4, jb0Var2, gh2Var4, i, i2));
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
                    jb0VarColors = jb0Var;
                    if (kk0Var.h(jb0VarColors)) {
                        i8 = 16384;
                    }
                    i3 |= i8;
                } else {
                    jb0VarColors = jb0Var;
                }
                i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i8;
            } else {
                jb0VarColors = jb0Var;
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
                if ((74899 & i3) == 74898) {
                    kk0Var.X();
                    je1Var = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    if (z) {
                        e14Var = e14.c;
                    } else {
                        e14Var = e14.d;
                    }
                    e14 e14Var9 = e14Var;
                    kk0Var.a0(1046936362);
                    if (le1Var != null) {
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | ((i3 & 14) == 4);
                        objP = kk0Var.P();
                        if (z6) {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        } else {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        }
                        je1Var = (je1) objP;
                    }
                    kk0Var.r(false);
                    TriStateCheckbox(e14Var9, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                    cVar5 = cVar4;
                    z4 = z3;
                    jb0Var2 = jb0VarColors;
                    gh2Var4 = gh2Var3;
                } else {
                    kk0Var.X();
                    je1Var = null;
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i9 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            gh2Var3 = null;
                        } else {
                            gh2Var3 = gh2Var2;
                        }
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    if (z) {
                        e14Var = e14.c;
                    } else {
                        e14Var = e14.d;
                    }
                    e14 e14Var10 = e14Var;
                    kk0Var.a0(1046936362);
                    if (le1Var != null) {
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | ((i3 & 14) == 4);
                        objP = kk0Var.P();
                        if (z6) {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        } else {
                            objP = new lb0(0, le1Var, z);
                            kk0Var.l0(objP);
                        }
                        je1Var = (je1) objP;
                    }
                    kk0Var.r(false);
                    TriStateCheckbox(e14Var10, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                    cVar5 = cVar4;
                    z4 = z3;
                    jb0Var2 = jb0VarColors;
                    gh2Var4 = gh2Var3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new mb0(z, le1Var, cVar5, z4, jb0Var2, gh2Var4, i, i2));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
            if ((74899 & i3) == 74898) {
                kk0Var.X();
                je1Var = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                if (z) {
                    e14Var = e14.c;
                } else {
                    e14Var = e14.d;
                }
                e14 e14Var11 = e14Var;
                kk0Var.a0(1046936362);
                if (le1Var != null) {
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((i3 & 14) == 4);
                    objP = kk0Var.P();
                    if (z6) {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    } else {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    }
                    je1Var = (je1) objP;
                }
                kk0Var.r(false);
                TriStateCheckbox(e14Var11, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                cVar5 = cVar4;
                z4 = z3;
                jb0Var2 = jb0VarColors;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var.X();
                je1Var = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                if (z) {
                    e14Var = e14.c;
                } else {
                    e14Var = e14.d;
                }
                e14 e14Var12 = e14Var;
                kk0Var.a0(1046936362);
                if (le1Var != null) {
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((i3 & 14) == 4);
                    objP = kk0Var.P();
                    if (z6) {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    } else {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    }
                    je1Var = (je1) objP;
                }
                kk0Var.r(false);
                TriStateCheckbox(e14Var12, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                cVar5 = cVar4;
                z4 = z3;
                jb0Var2 = jb0VarColors;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new mb0(z, le1Var, cVar5, z4, jb0Var2, gh2Var4, i, i2));
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jb0VarColors = jb0Var;
                if (kk0Var.h(jb0VarColors)) {
                    i8 = 16384;
                }
                i3 |= i8;
            } else {
                jb0VarColors = jb0Var;
            }
            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i8;
        } else {
            jb0VarColors = jb0Var;
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
            if ((74899 & i3) == 74898) {
                kk0Var.X();
                je1Var = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                if (z) {
                    e14Var = e14.c;
                } else {
                    e14Var = e14.d;
                }
                e14 e14Var13 = e14Var;
                kk0Var.a0(1046936362);
                if (le1Var != null) {
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((i3 & 14) == 4);
                    objP = kk0Var.P();
                    if (z6) {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    } else {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    }
                    je1Var = (je1) objP;
                }
                kk0Var.r(false);
                TriStateCheckbox(e14Var13, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                cVar5 = cVar4;
                z4 = z3;
                jb0Var2 = jb0VarColors;
                gh2Var4 = gh2Var3;
            } else {
                kk0Var.X();
                je1Var = null;
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i9 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        gh2Var3 = null;
                    } else {
                        gh2Var3 = gh2Var2;
                    }
                    cVar4 = cVar3;
                }
                kk0Var.s();
                if (z) {
                    e14Var = e14.c;
                } else {
                    e14Var = e14.d;
                }
                e14 e14Var14 = e14Var;
                kk0Var.a0(1046936362);
                if (le1Var != null) {
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((i3 & 14) == 4);
                    objP = kk0Var.P();
                    if (z6) {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    } else {
                        objP = new lb0(0, le1Var, z);
                        kk0Var.l0(objP);
                    }
                    je1Var = (je1) objP;
                }
                kk0Var.r(false);
                TriStateCheckbox(e14Var14, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
                cVar5 = cVar4;
                z4 = z3;
                jb0Var2 = jb0VarColors;
                gh2Var4 = gh2Var3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new mb0(z, le1Var, cVar5, z4, jb0Var2, gh2Var4, i, i2));
            }
        }
        i3 |= 196608;
        gh2Var2 = gh2Var;
        if ((74899 & i3) == 74898) {
            kk0Var.X();
            je1Var = null;
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jb0VarColors = kb0.a.colors(kk0Var, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var2;
                }
                cVar4 = cVar3;
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jb0VarColors = kb0.a.colors(kk0Var, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var2;
                }
                cVar4 = cVar3;
            }
            kk0Var.s();
            if (z) {
                e14Var = e14.c;
            } else {
                e14Var = e14.d;
            }
            e14 e14Var15 = e14Var;
            kk0Var.a0(1046936362);
            if (le1Var != null) {
                if ((i3 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((i3 & 14) == 4);
                objP = kk0Var.P();
                if (z6) {
                    objP = new lb0(0, le1Var, z);
                    kk0Var.l0(objP);
                } else {
                    objP = new lb0(0, le1Var, z);
                    kk0Var.l0(objP);
                }
                je1Var = (je1) objP;
            }
            kk0Var.r(false);
            TriStateCheckbox(e14Var15, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
            cVar5 = cVar4;
            z4 = z3;
            jb0Var2 = jb0VarColors;
            gh2Var4 = gh2Var3;
        } else {
            kk0Var.X();
            je1Var = null;
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jb0VarColors = kb0.a.colors(kk0Var, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var2;
                }
                cVar4 = cVar3;
            } else {
                if (i9 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jb0VarColors = kb0.a.colors(kk0Var, 6);
                }
                if (i6 != 0) {
                    gh2Var3 = null;
                } else {
                    gh2Var3 = gh2Var2;
                }
                cVar4 = cVar3;
            }
            kk0Var.s();
            if (z) {
                e14Var = e14.c;
            } else {
                e14Var = e14.d;
            }
            e14 e14Var16 = e14Var;
            kk0Var.a0(1046936362);
            if (le1Var != null) {
                if ((i3 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((i3 & 14) == 4);
                objP = kk0Var.P();
                if (z6) {
                    objP = new lb0(0, le1Var, z);
                    kk0Var.l0(objP);
                } else {
                    objP = new lb0(0, le1Var, z);
                    kk0Var.l0(objP);
                }
                je1Var = (je1) objP;
            }
            kk0Var.r(false);
            TriStateCheckbox(e14Var16, je1Var, cVar4, z3, jb0VarColors, gh2Var3, kk0Var, i3 & 524160, 0);
            cVar5 = cVar4;
            z4 = z3;
            jb0Var2 = jb0VarColors;
            gh2Var4 = gh2Var3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new mb0(z, le1Var, cVar5, z4, jb0Var2, gh2Var4, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckboxImpl(boolean z, e14 e14Var, c cVar, jb0 jb0Var, ck0 ck0Var, int i) {
        int i2;
        float f;
        float f2;
        float f3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(2007131616);
        if ((i & 6) == 0) {
            i2 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(e14Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.h(cVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var.h(jb0Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && kk0Var.F()) {
            kk0Var.V();
        } else {
            int i3 = i2 >> 3;
            int i4 = i3 & 14;
            o54 o54VarUpdateTransition = b64.updateTransition(e14Var, (String) null, kk0Var, i4, 2);
            x64 x64Var = mb4.a;
            Object objB = o54VarUpdateTransition.b();
            ft2 ft2Var = o54VarUpdateTransition.d;
            kk0Var.a0(1800065638);
            int iOrdinal = ((e14) objB).ordinal();
            float f4 = 0.0f;
            if (iOrdinal == 0) {
                f = 1.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u41.e();
                    return;
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            kk0Var.r(false);
            Float fValueOf = Float.valueOf(f);
            e14 e14Var2 = (e14) ft2Var.getValue();
            kk0Var.a0(1800065638);
            int iOrdinal2 = e14Var2.ordinal();
            if (iOrdinal2 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    u41.e();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            kk0Var.r(false);
            int i5 = i2;
            gn3 gn3VarCreateTransitionAnimation = b64.createTransitionAnimation(o54VarUpdateTransition, fValueOf, Float.valueOf(f2), (o71) pb0.c.invoke((Object) o54VarUpdateTransition.e(), (Object) kk0Var, (Object) 0), x64Var, "FloatAnimation", kk0Var, 0);
            e14 e14Var3 = (e14) o54VarUpdateTransition.b();
            kk0Var.a0(-1426969489);
            int iOrdinal3 = e14Var3.ordinal();
            if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                f3 = 0.0f;
            } else {
                if (iOrdinal3 != 2) {
                    u41.e();
                    return;
                }
                f3 = 1.0f;
            }
            kk0Var.r(false);
            Float fValueOf2 = Float.valueOf(f3);
            e14 e14Var4 = (e14) ft2Var.getValue();
            kk0Var.a0(-1426969489);
            int iOrdinal4 = e14Var4.ordinal();
            if (iOrdinal4 != 0 && iOrdinal4 != 1) {
                if (iOrdinal4 != 2) {
                    u41.e();
                    return;
                }
                f4 = 1.0f;
            }
            kk0Var.r(false);
            gn3 gn3VarCreateTransitionAnimation2 = b64.createTransitionAnimation(o54VarUpdateTransition, fValueOf2, Float.valueOf(f4), (o71) ob0.c.invoke((Object) o54VarUpdateTransition.e(), (Object) kk0Var, (Object) 0), x64Var, "FloatAnimation", kk0Var, 0);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ib0();
                kk0Var.l0(objP);
            }
            ib0 ib0Var = (ib0) objP;
            gn3 gn3VarCheckmarkColor$material3_release = jb0Var.checkmarkColor$material3_release(e14Var, kk0Var, i4 | ((i5 >> 6) & 112));
            int i6 = (i5 & 126) | (i3 & 896);
            gn3 gn3VarBoxColor$material3_release = jb0Var.boxColor$material3_release(z, e14Var, kk0Var, i6);
            gn3 gn3VarBorderColor$material3_release = jb0Var.borderColor$material3_release(z, e14Var, kk0Var, i6);
            c cVarG = d.g(d.q(cVar, Alignment$Companion.getCenter()));
            boolean zH = kk0Var.h(gn3VarBoxColor$material3_release) | kk0Var.h(gn3VarBorderColor$material3_release) | kk0Var.h(gn3VarCheckmarkColor$material3_release) | kk0Var.h(gn3VarCreateTransitionAnimation) | kk0Var.h(gn3VarCreateTransitionAnimation2);
            Object objP2 = kk0Var.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new xw(gn3VarBoxColor$material3_release, gn3VarBorderColor$material3_release, gn3VarCheckmarkColor$material3_release, gn3VarCreateTransitionAnimation, gn3VarCreateTransitionAnimation2, ib0Var, 1);
                kk0Var.l0(objP2);
            }
            c10.Canvas(cVarG, (le1) objP2, kk0Var, 0);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new nb0(z, e14Var, cVar, jb0Var, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0146  */
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:106:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x013a  */
    public static final void TriStateCheckbox(e14 e14Var, je1 je1Var, c cVar, boolean z, jb0 jb0Var, gh2 gh2Var, ck0 ck0Var, int i, int i2) {
        e14 e14Var2;
        int i3;
        c cVar2;
        int i4;
        boolean z2;
        int i5;
        jb0 jb0VarColors;
        int i6;
        gh2 gh2Var2;
        int i7;
        c cVar3;
        int i8;
        boolean z3;
        jb0 jb0Var2;
        float f;
        boolean z4;
        c cVarC;
        c cVar4;
        boolean z5;
        jb0 jb0Var3;
        c cVar5;
        gh2 gh2Var3;
        w33 w33VarV;
        int i9;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1608358065);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            e14Var2 = e14Var;
        } else {
            e14Var2 = e14Var;
            if ((i & 6) == 0) {
                i3 = (kk0Var.h(e14Var2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
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
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        jb0VarColors = jb0Var;
                        if (kk0Var.h(jb0VarColors)) {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    } else {
                        jb0VarColors = jb0Var;
                    }
                    i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i9;
                } else {
                    jb0VarColors = jb0Var;
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
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                jb0VarColors = kb0.a.colors(kk0Var, 6);
                            }
                            if (i6 != 0) {
                                i8 = i3;
                                gh2Var2 = null;
                                z3 = z2;
                                jb0Var2 = jb0VarColors;
                            } else {
                                i8 = i3;
                            }
                            kk0Var.s();
                            kk0Var.a0(-97239746);
                            if (je1Var != null) {
                                z4 = z3;
                                f = 2.0f;
                                cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                            } else {
                                f = 2.0f;
                                z4 = z3;
                                cVarC = c.i;
                            }
                            kk0Var.r(false);
                            if (je1Var != null) {
                                un3 un3Var = vq1.a;
                                cVar4 = MinimumInteractiveModifier.c;
                            } else {
                                cVar4 = c.i;
                            }
                            boolean z6 = z4;
                            jb0 jb0Var4 = jb0Var2;
                            CheckboxImpl(z6, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var4, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                            z5 = z6;
                            jb0Var3 = jb0Var4;
                            cVar5 = cVar3;
                        } else {
                            kk0Var.V();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i8 = i3;
                            cVar3 = cVar2;
                        }
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
                        kk0Var.s();
                        kk0Var.a0(-97239746);
                        if (je1Var != null) {
                            z4 = z3;
                            f = 2.0f;
                            cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                        } else {
                            f = 2.0f;
                            z4 = z3;
                            cVarC = c.i;
                        }
                        kk0Var.r(false);
                        if (je1Var != null) {
                            un3 un3Var2 = vq1.a;
                            cVar4 = MinimumInteractiveModifier.c;
                        } else {
                            cVar4 = c.i;
                        }
                        boolean z7 = z4;
                        jb0 jb0Var5 = jb0Var2;
                        CheckboxImpl(z7, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var5, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                        z5 = z7;
                        jb0Var3 = jb0Var5;
                        cVar5 = cVar3;
                    } else {
                        kk0Var.V();
                        cVar5 = cVar2;
                        z5 = z2;
                        jb0Var3 = jb0VarColors;
                    }
                    gh2Var3 = gh2Var2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jf(e14Var, je1Var, cVar5, z5, jb0Var3, gh2Var3, i, i2));
                    }
                }
                i3 |= 196608;
                gh2Var2 = gh2Var;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    kk0Var.a0(-97239746);
                    if (je1Var != null) {
                        z4 = z3;
                        f = 2.0f;
                        cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                    } else {
                        f = 2.0f;
                        z4 = z3;
                        cVarC = c.i;
                    }
                    kk0Var.r(false);
                    if (je1Var != null) {
                        un3 un3Var3 = vq1.a;
                        cVar4 = MinimumInteractiveModifier.c;
                    } else {
                        cVar4 = c.i;
                    }
                    boolean z8 = z4;
                    jb0 jb0Var6 = jb0Var2;
                    CheckboxImpl(z8, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var6, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                    z5 = z8;
                    jb0Var3 = jb0Var6;
                    cVar5 = cVar3;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    kk0Var.a0(-97239746);
                    if (je1Var != null) {
                        z4 = z3;
                        f = 2.0f;
                        cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                    } else {
                        f = 2.0f;
                        z4 = z3;
                        cVarC = c.i;
                    }
                    kk0Var.r(false);
                    if (je1Var != null) {
                        un3 un3Var4 = vq1.a;
                        cVar4 = MinimumInteractiveModifier.c;
                    } else {
                        cVar4 = c.i;
                    }
                    boolean z9 = z4;
                    jb0 jb0Var7 = jb0Var2;
                    CheckboxImpl(z9, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var7, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                    z5 = z9;
                    jb0Var3 = jb0Var7;
                    cVar5 = cVar3;
                }
                gh2Var3 = gh2Var2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(e14Var, je1Var, cVar5, z5, jb0Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jb0VarColors = jb0Var;
                    if (kk0Var.h(jb0VarColors)) {
                        i9 = 16384;
                    }
                    i3 |= i9;
                } else {
                    jb0VarColors = jb0Var;
                }
                i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i9;
            } else {
                jb0VarColors = jb0Var;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    kk0Var.a0(-97239746);
                    if (je1Var != null) {
                        z4 = z3;
                        f = 2.0f;
                        cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                    } else {
                        f = 2.0f;
                        z4 = z3;
                        cVarC = c.i;
                    }
                    kk0Var.r(false);
                    if (je1Var != null) {
                        un3 un3Var5 = vq1.a;
                        cVar4 = MinimumInteractiveModifier.c;
                    } else {
                        cVar4 = c.i;
                    }
                    boolean z10 = z4;
                    jb0 jb0Var8 = jb0Var2;
                    CheckboxImpl(z10, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var8, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                    z5 = z10;
                    jb0Var3 = jb0Var8;
                    cVar5 = cVar3;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    kk0Var.a0(-97239746);
                    if (je1Var != null) {
                        z4 = z3;
                        f = 2.0f;
                        cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                    } else {
                        f = 2.0f;
                        z4 = z3;
                        cVarC = c.i;
                    }
                    kk0Var.r(false);
                    if (je1Var != null) {
                        un3 un3Var6 = vq1.a;
                        cVar4 = MinimumInteractiveModifier.c;
                    } else {
                        cVar4 = c.i;
                    }
                    boolean z11 = z4;
                    jb0 jb0Var9 = jb0Var2;
                    CheckboxImpl(z11, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var9, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                    z5 = z11;
                    jb0Var3 = jb0Var9;
                    cVar5 = cVar3;
                }
                gh2Var3 = gh2Var2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(e14Var, je1Var, cVar5, z5, jb0Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
                    }
                }
                kk0Var.s();
                kk0Var.a0(-97239746);
                if (je1Var != null) {
                    z4 = z3;
                    f = 2.0f;
                    cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                } else {
                    f = 2.0f;
                    z4 = z3;
                    cVarC = c.i;
                }
                kk0Var.r(false);
                if (je1Var != null) {
                    un3 un3Var7 = vq1.a;
                    cVar4 = MinimumInteractiveModifier.c;
                } else {
                    cVar4 = c.i;
                }
                boolean z12 = z4;
                jb0 jb0Var10 = jb0Var2;
                CheckboxImpl(z12, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var10, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                z5 = z12;
                jb0Var3 = jb0Var10;
                cVar5 = cVar3;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
                    }
                }
                kk0Var.s();
                kk0Var.a0(-97239746);
                if (je1Var != null) {
                    z4 = z3;
                    f = 2.0f;
                    cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                } else {
                    f = 2.0f;
                    z4 = z3;
                    cVarC = c.i;
                }
                kk0Var.r(false);
                if (je1Var != null) {
                    un3 un3Var8 = vq1.a;
                    cVar4 = MinimumInteractiveModifier.c;
                } else {
                    cVar4 = c.i;
                }
                boolean z13 = z4;
                jb0 jb0Var11 = jb0Var2;
                CheckboxImpl(z13, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var11, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                z5 = z13;
                jb0Var3 = jb0Var11;
                cVar5 = cVar3;
            }
            gh2Var3 = gh2Var2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(e14Var, je1Var, cVar5, z5, jb0Var3, gh2Var3, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
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
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jb0VarColors = jb0Var;
                    if (kk0Var.h(jb0VarColors)) {
                        i9 = 16384;
                    }
                    i3 |= i9;
                } else {
                    jb0VarColors = jb0Var;
                }
                i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i9;
            } else {
                jb0VarColors = jb0Var;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    kk0Var.a0(-97239746);
                    if (je1Var != null) {
                        z4 = z3;
                        f = 2.0f;
                        cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                    } else {
                        f = 2.0f;
                        z4 = z3;
                        cVarC = c.i;
                    }
                    kk0Var.r(false);
                    if (je1Var != null) {
                        un3 un3Var9 = vq1.a;
                        cVar4 = MinimumInteractiveModifier.c;
                    } else {
                        cVar4 = c.i;
                    }
                    boolean z14 = z4;
                    jb0 jb0Var12 = jb0Var2;
                    CheckboxImpl(z14, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var12, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                    z5 = z14;
                    jb0Var3 = jb0Var12;
                    cVar5 = cVar3;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
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
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            jb0VarColors = kb0.a.colors(kk0Var, 6);
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            gh2Var2 = null;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                        } else {
                            i8 = i3;
                            z3 = z2;
                            jb0Var2 = jb0VarColors;
                            gh2Var2 = gh2Var2;
                        }
                    }
                    kk0Var.s();
                    kk0Var.a0(-97239746);
                    if (je1Var != null) {
                        z4 = z3;
                        f = 2.0f;
                        cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                    } else {
                        f = 2.0f;
                        z4 = z3;
                        cVarC = c.i;
                    }
                    kk0Var.r(false);
                    if (je1Var != null) {
                        un3 un3Var10 = vq1.a;
                        cVar4 = MinimumInteractiveModifier.c;
                    } else {
                        cVar4 = c.i;
                    }
                    boolean z15 = z4;
                    jb0 jb0Var13 = jb0Var2;
                    CheckboxImpl(z15, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var13, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                    z5 = z15;
                    jb0Var3 = jb0Var13;
                    cVar5 = cVar3;
                }
                gh2Var3 = gh2Var2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(e14Var, je1Var, cVar5, z5, jb0Var3, gh2Var3, i, i2));
                }
            }
            i3 |= 196608;
            gh2Var2 = gh2Var;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
                    }
                }
                kk0Var.s();
                kk0Var.a0(-97239746);
                if (je1Var != null) {
                    z4 = z3;
                    f = 2.0f;
                    cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                } else {
                    f = 2.0f;
                    z4 = z3;
                    cVarC = c.i;
                }
                kk0Var.r(false);
                if (je1Var != null) {
                    un3 un3Var11 = vq1.a;
                    cVar4 = MinimumInteractiveModifier.c;
                } else {
                    cVar4 = c.i;
                }
                boolean z16 = z4;
                jb0 jb0Var14 = jb0Var2;
                CheckboxImpl(z16, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var14, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                z5 = z16;
                jb0Var3 = jb0Var14;
                cVar5 = cVar3;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
                    }
                }
                kk0Var.s();
                kk0Var.a0(-97239746);
                if (je1Var != null) {
                    z4 = z3;
                    f = 2.0f;
                    cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                } else {
                    f = 2.0f;
                    z4 = z3;
                    cVarC = c.i;
                }
                kk0Var.r(false);
                if (je1Var != null) {
                    un3 un3Var12 = vq1.a;
                    cVar4 = MinimumInteractiveModifier.c;
                } else {
                    cVar4 = c.i;
                }
                boolean z17 = z4;
                jb0 jb0Var15 = jb0Var2;
                CheckboxImpl(z17, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var15, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                z5 = z17;
                jb0Var3 = jb0Var15;
                cVar5 = cVar3;
            }
            gh2Var3 = gh2Var2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(e14Var, je1Var, cVar5, z5, jb0Var3, gh2Var3, i, i2));
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jb0VarColors = jb0Var;
                if (kk0Var.h(jb0VarColors)) {
                    i9 = 16384;
                }
                i3 |= i9;
            } else {
                jb0VarColors = jb0Var;
            }
            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i9;
        } else {
            jb0VarColors = jb0Var;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
                    }
                }
                kk0Var.s();
                kk0Var.a0(-97239746);
                if (je1Var != null) {
                    z4 = z3;
                    f = 2.0f;
                    cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                } else {
                    f = 2.0f;
                    z4 = z3;
                    cVarC = c.i;
                }
                kk0Var.r(false);
                if (je1Var != null) {
                    un3 un3Var13 = vq1.a;
                    cVar4 = MinimumInteractiveModifier.c;
                } else {
                    cVar4 = c.i;
                }
                boolean z18 = z4;
                jb0 jb0Var16 = jb0Var2;
                CheckboxImpl(z18, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var16, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                z5 = z18;
                jb0Var3 = jb0Var16;
                cVar5 = cVar3;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jb0VarColors = kb0.a.colors(kk0Var, 6);
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        gh2Var2 = null;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                    } else {
                        i8 = i3;
                        z3 = z2;
                        jb0Var2 = jb0VarColors;
                        gh2Var2 = gh2Var2;
                    }
                }
                kk0Var.s();
                kk0Var.a0(-97239746);
                if (je1Var != null) {
                    z4 = z3;
                    f = 2.0f;
                    cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
                } else {
                    f = 2.0f;
                    z4 = z3;
                    cVarC = c.i;
                }
                kk0Var.r(false);
                if (je1Var != null) {
                    un3 un3Var14 = vq1.a;
                    cVar4 = MinimumInteractiveModifier.c;
                } else {
                    cVar4 = c.i;
                }
                boolean z19 = z4;
                jb0 jb0Var17 = jb0Var2;
                CheckboxImpl(z19, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var17, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
                z5 = z19;
                jb0Var3 = jb0Var17;
                cVar5 = cVar3;
            }
            gh2Var3 = gh2Var2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(e14Var, je1Var, cVar5, z5, jb0Var3, gh2Var3, i, i2));
            }
        }
        i3 |= 196608;
        gh2Var2 = gh2Var;
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
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jb0VarColors = kb0.a.colors(kk0Var, 6);
                }
                if (i6 != 0) {
                    i8 = i3;
                    gh2Var2 = null;
                    z3 = z2;
                    jb0Var2 = jb0VarColors;
                } else {
                    i8 = i3;
                    z3 = z2;
                    jb0Var2 = jb0VarColors;
                    gh2Var2 = gh2Var2;
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
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jb0VarColors = kb0.a.colors(kk0Var, 6);
                }
                if (i6 != 0) {
                    i8 = i3;
                    gh2Var2 = null;
                    z3 = z2;
                    jb0Var2 = jb0VarColors;
                } else {
                    i8 = i3;
                    z3 = z2;
                    jb0Var2 = jb0VarColors;
                    gh2Var2 = gh2Var2;
                }
            }
            kk0Var.s();
            kk0Var.a0(-97239746);
            if (je1Var != null) {
                z4 = z3;
                f = 2.0f;
                cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
            } else {
                f = 2.0f;
                z4 = z3;
                cVarC = c.i;
            }
            kk0Var.r(false);
            if (je1Var != null) {
                un3 un3Var15 = vq1.a;
                cVar4 = MinimumInteractiveModifier.c;
            } else {
                cVar4 = c.i;
            }
            boolean z110 = z4;
            jb0 jb0Var18 = jb0Var2;
            CheckboxImpl(z110, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var18, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
            z5 = z110;
            jb0Var3 = jb0Var18;
            cVar5 = cVar3;
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
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jb0VarColors = kb0.a.colors(kk0Var, 6);
                }
                if (i6 != 0) {
                    i8 = i3;
                    gh2Var2 = null;
                    z3 = z2;
                    jb0Var2 = jb0VarColors;
                } else {
                    i8 = i3;
                    z3 = z2;
                    jb0Var2 = jb0VarColors;
                    gh2Var2 = gh2Var2;
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
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jb0VarColors = kb0.a.colors(kk0Var, 6);
                }
                if (i6 != 0) {
                    i8 = i3;
                    gh2Var2 = null;
                    z3 = z2;
                    jb0Var2 = jb0VarColors;
                } else {
                    i8 = i3;
                    z3 = z2;
                    jb0Var2 = jb0VarColors;
                    gh2Var2 = gh2Var2;
                }
            }
            kk0Var.s();
            kk0Var.a0(-97239746);
            if (je1Var != null) {
                z4 = z3;
                f = 2.0f;
                cVarC = b.c(c.i, e14Var2, gh2Var2, g73.m194xaeb141ad(false, rb0.d / 2.0f, 0L, kk0Var, 54, 4), z4, new n73(1), je1Var);
            } else {
                f = 2.0f;
                z4 = z3;
                cVarC = c.i;
            }
            kk0Var.r(false);
            if (je1Var != null) {
                un3 un3Var16 = vq1.a;
                cVar4 = MinimumInteractiveModifier.c;
            } else {
                cVar4 = c.i;
            }
            boolean z111 = z4;
            jb0 jb0Var19 = jb0Var2;
            CheckboxImpl(z111, e14Var, a.k(cVar3.then(cVar4).then(cVarC), f), jb0Var19, kk0Var, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
            z5 = z111;
            jb0Var3 = jb0Var19;
            cVar5 = cVar3;
        }
        gh2Var3 = gh2Var2;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new jf(e14Var, je1Var, cVar5, z5, jb0Var3, gh2Var3, i, i2));
        }
    }
}
