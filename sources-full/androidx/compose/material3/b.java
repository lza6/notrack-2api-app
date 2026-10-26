package androidx.compose.material3;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import defpackage.b11;
import defpackage.ck0;
import defpackage.d4;
import defpackage.fq2;
import defpackage.g73;
import defpackage.gh2;
import defpackage.gn0;
import defpackage.kk0;
import defpackage.kr1;
import defpackage.le1;
import defpackage.ml1;
import defpackage.n73;
import defpackage.ne1;
import defpackage.ok3;
import defpackage.pe;
import defpackage.rg3;
import defpackage.rj0;
import defpackage.sf3;
import defpackage.su2;
import defpackage.t64;
import defpackage.tg3;
import defpackage.tq3;
import defpackage.un3;
import defpackage.uq1;
import defpackage.uq3;
import defpackage.vb2;
import defpackage.vq1;
import defpackage.vq3;
import defpackage.vw;
import defpackage.w33;
import defpackage.wg3;
import defpackage.xk;
import defpackage.xp1;
import defpackage.yk0;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final float a = 4.0f;
    public static final ok3 b = new ok3(0);
    public static final t64 c = new t64(100, (b11) null, 6);

    /* JADX WARN: Code duplicated, block: B:100:0x010d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0110  */
    /* JADX WARN: Code duplicated, block: B:105:0x0116  */
    /* JADX WARN: Code duplicated, block: B:107:0x0121  */
    /* JADX WARN: Code duplicated, block: B:108:0x0127  */
    /* JADX WARN: Code duplicated, block: B:111:0x0134  */
    /* JADX WARN: Code duplicated, block: B:113:0x013e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:118:0x014e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109  */
    public static final void Switch(boolean z, le1 le1Var, c cVar, ne1 ne1Var, boolean z2, tq3 tq3Var, gh2 gh2Var, ck0 ck0Var, int i, int i2) {
        boolean z3;
        int i3;
        c cVar2;
        int i4;
        ne1 ne1Var2;
        int i5;
        int i6;
        boolean z4;
        int i7;
        tq3 tq3VarColors;
        int i8;
        gh2 gh2Var2;
        int i9;
        c cVar3;
        c cVar4;
        int i10;
        gh2 gh2Var3;
        ne1 ne1Var3;
        gh2 gh2Var4;
        c cVarB;
        kk0 kk0Var;
        ne1 ne1Var4;
        gh2 gh2Var5;
        Object objP;
        boolean z5;
        tq3 tq3Var2;
        w33 w33VarV;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1580463220);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (kk0Var2.i(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var2.j(le1Var) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    ne1Var2 = ne1Var;
                    if (kk0Var2.j(ne1Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        if (kk0Var2.i(z4)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            tq3VarColors = tq3Var;
                            int i12 = kk0Var2.h(tq3VarColors) ? 131072 : 65536;
                            i3 |= i12;
                        } else {
                            tq3VarColors = tq3Var;
                        }
                        i3 |= i12;
                    } else {
                        tq3VarColors = tq3Var;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            gh2Var2 = gh2Var;
                            if (kk0Var2.h(gh2Var2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((599187 & i3) == 599186 || !kk0Var2.F()) {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i11 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if (i4 != 0) {
                                    ne1Var2 = null;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    tq3VarColors = uq3.a.colors(kk0Var2, 6);
                                }
                                if (i8 != 0) {
                                    i10 = i3;
                                    cVar4 = cVar3;
                                    gh2Var3 = null;
                                    ne1Var3 = ne1Var2;
                                } else {
                                    cVar4 = cVar3;
                                }
                                kk0Var2.s();
                                kk0Var2.a0(783532531);
                                if (gh2Var3 == null) {
                                    objP = kk0Var2.P();
                                    if (objP == Composer$Companion.getEmpty()) {
                                        objP = fq2.j(kk0Var2);
                                    }
                                    gh2Var4 = (gh2) objP;
                                } else {
                                    gh2Var4 = gh2Var3;
                                }
                                kk0Var2.r(false);
                                if (le1Var != null) {
                                    Modifier$Companion modifier$Companion = c.i;
                                    un3 un3Var = vq1.a;
                                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                                } else {
                                    cVarB = c.i;
                                }
                                int i13 = i10 << 3;
                                int i14 = i10 >> 6;
                                kk0Var = kk0Var2;
                                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i13 & 112) | (i14 & 896) | (i14 & 7168) | (i13 & 57344));
                                cVar2 = cVar4;
                                ne1Var4 = ne1Var3;
                                gh2Var5 = gh2Var3;
                            } else {
                                kk0Var2.V();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                cVar4 = cVar2;
                            }
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                            kk0Var2.s();
                            kk0Var2.a0(783532531);
                            if (gh2Var3 == null) {
                                objP = kk0Var2.P();
                                if (objP == Composer$Companion.getEmpty()) {
                                    objP = fq2.j(kk0Var2);
                                }
                                gh2Var4 = (gh2) objP;
                            } else {
                                gh2Var4 = gh2Var3;
                            }
                            kk0Var2.r(false);
                            if (le1Var != null) {
                                Modifier$Companion modifier$Companion2 = c.i;
                                un3 un3Var2 = vq1.a;
                                cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                            } else {
                                cVarB = c.i;
                            }
                            int i15 = i10 << 3;
                            int i16 = i10 >> 6;
                            kk0Var = kk0Var2;
                            SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i15 & 112) | (i16 & 896) | (i16 & 7168) | (i15 & 57344));
                            cVar2 = cVar4;
                            ne1Var4 = ne1Var3;
                            gh2Var5 = gh2Var3;
                        } else {
                            kk0Var2.V();
                            ne1Var4 = ne1Var2;
                            kk0Var = kk0Var2;
                            gh2Var5 = gh2Var2;
                        }
                        z5 = z4;
                        tq3Var2 = tq3VarColors;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                        }
                    }
                    i3 |= 1572864;
                    gh2Var2 = gh2Var;
                    if ((599187 & i3) == 599186) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        } else {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        }
                        kk0Var2.s();
                        kk0Var2.a0(783532531);
                        if (gh2Var3 == null) {
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = fq2.j(kk0Var2);
                            }
                            gh2Var4 = (gh2) objP;
                        } else {
                            gh2Var4 = gh2Var3;
                        }
                        kk0Var2.r(false);
                        if (le1Var != null) {
                            Modifier$Companion modifier$Companion3 = c.i;
                            un3 un3Var3 = vq1.a;
                            cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                        } else {
                            cVarB = c.i;
                        }
                        int i17 = i10 << 3;
                        int i18 = i10 >> 6;
                        kk0Var = kk0Var2;
                        SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i17 & 112) | (i18 & 896) | (i18 & 7168) | (i17 & 57344));
                        cVar2 = cVar4;
                        ne1Var4 = ne1Var3;
                        gh2Var5 = gh2Var3;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        } else {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        }
                        kk0Var2.s();
                        kk0Var2.a0(783532531);
                        if (gh2Var3 == null) {
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = fq2.j(kk0Var2);
                            }
                            gh2Var4 = (gh2) objP;
                        } else {
                            gh2Var4 = gh2Var3;
                        }
                        kk0Var2.r(false);
                        if (le1Var != null) {
                            Modifier$Companion modifier$Companion4 = c.i;
                            un3 un3Var4 = vq1.a;
                            cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                        } else {
                            cVarB = c.i;
                        }
                        int i19 = i10 << 3;
                        int i110 = i10 >> 6;
                        kk0Var = kk0Var2;
                        SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i19 & 112) | (i110 & 896) | (i110 & 7168) | (i19 & 57344));
                        cVar2 = cVar4;
                        ne1Var4 = ne1Var3;
                        gh2Var5 = gh2Var3;
                    }
                    z5 = z4;
                    tq3Var2 = tq3VarColors;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                    }
                }
                i3 |= 24576;
                z4 = z2;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tq3VarColors = tq3Var;
                        if (kk0Var2.h(tq3VarColors)) {
                        }
                        i3 |= i12;
                    } else {
                        tq3VarColors = tq3Var;
                    }
                    i3 |= i12;
                } else {
                    tq3VarColors = tq3Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var2.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((599187 & i3) == 599186) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        } else {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        }
                        kk0Var2.s();
                        kk0Var2.a0(783532531);
                        if (gh2Var3 == null) {
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = fq2.j(kk0Var2);
                            }
                            gh2Var4 = (gh2) objP;
                        } else {
                            gh2Var4 = gh2Var3;
                        }
                        kk0Var2.r(false);
                        if (le1Var != null) {
                            Modifier$Companion modifier$Companion5 = c.i;
                            un3 un3Var5 = vq1.a;
                            cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                        } else {
                            cVarB = c.i;
                        }
                        int i111 = i10 << 3;
                        int i112 = i10 >> 6;
                        kk0Var = kk0Var2;
                        SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i111 & 112) | (i112 & 896) | (i112 & 7168) | (i111 & 57344));
                        cVar2 = cVar4;
                        ne1Var4 = ne1Var3;
                        gh2Var5 = gh2Var3;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        } else {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        }
                        kk0Var2.s();
                        kk0Var2.a0(783532531);
                        if (gh2Var3 == null) {
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = fq2.j(kk0Var2);
                            }
                            gh2Var4 = (gh2) objP;
                        } else {
                            gh2Var4 = gh2Var3;
                        }
                        kk0Var2.r(false);
                        if (le1Var != null) {
                            Modifier$Companion modifier$Companion6 = c.i;
                            un3 un3Var6 = vq1.a;
                            cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                        } else {
                            cVarB = c.i;
                        }
                        int i113 = i10 << 3;
                        int i114 = i10 >> 6;
                        kk0Var = kk0Var2;
                        SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i113 & 112) | (i114 & 896) | (i114 & 7168) | (i113 & 57344));
                        cVar2 = cVar4;
                        ne1Var4 = ne1Var3;
                        gh2Var5 = gh2Var3;
                    }
                    z5 = z4;
                    tq3Var2 = tq3VarColors;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion7 = c.i;
                        un3 un3Var7 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i115 = i10 << 3;
                    int i116 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i115 & 112) | (i116 & 896) | (i116 & 7168) | (i115 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion8 = c.i;
                        un3 un3Var8 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i117 = i10 << 3;
                    int i118 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i117 & 112) | (i118 & 896) | (i118 & 7168) | (i117 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                }
                z5 = z4;
                tq3Var2 = tq3VarColors;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                }
            }
            i3 |= 3072;
            ne1Var2 = ne1Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (kk0Var2.i(z4)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tq3VarColors = tq3Var;
                        if (kk0Var2.h(tq3VarColors)) {
                        }
                        i3 |= i12;
                    } else {
                        tq3VarColors = tq3Var;
                    }
                    i3 |= i12;
                } else {
                    tq3VarColors = tq3Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var2.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((599187 & i3) == 599186) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        } else {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        }
                        kk0Var2.s();
                        kk0Var2.a0(783532531);
                        if (gh2Var3 == null) {
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = fq2.j(kk0Var2);
                            }
                            gh2Var4 = (gh2) objP;
                        } else {
                            gh2Var4 = gh2Var3;
                        }
                        kk0Var2.r(false);
                        if (le1Var != null) {
                            Modifier$Companion modifier$Companion9 = c.i;
                            un3 un3Var9 = vq1.a;
                            cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                        } else {
                            cVarB = c.i;
                        }
                        int i119 = i10 << 3;
                        int i1110 = i10 >> 6;
                        kk0Var = kk0Var2;
                        SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i119 & 112) | (i1110 & 896) | (i1110 & 7168) | (i119 & 57344));
                        cVar2 = cVar4;
                        ne1Var4 = ne1Var3;
                        gh2Var5 = gh2Var3;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        } else {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        }
                        kk0Var2.s();
                        kk0Var2.a0(783532531);
                        if (gh2Var3 == null) {
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = fq2.j(kk0Var2);
                            }
                            gh2Var4 = (gh2) objP;
                        } else {
                            gh2Var4 = gh2Var3;
                        }
                        kk0Var2.r(false);
                        if (le1Var != null) {
                            Modifier$Companion modifier$Companion10 = c.i;
                            un3 un3Var10 = vq1.a;
                            cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                        } else {
                            cVarB = c.i;
                        }
                        int i1111 = i10 << 3;
                        int i1112 = i10 >> 6;
                        kk0Var = kk0Var2;
                        SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1111 & 112) | (i1112 & 896) | (i1112 & 7168) | (i1111 & 57344));
                        cVar2 = cVar4;
                        ne1Var4 = ne1Var3;
                        gh2Var5 = gh2Var3;
                    }
                    z5 = z4;
                    tq3Var2 = tq3VarColors;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion11 = c.i;
                        un3 un3Var11 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i1113 = i10 << 3;
                    int i1114 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1113 & 112) | (i1114 & 896) | (i1114 & 7168) | (i1113 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion12 = c.i;
                        un3 un3Var12 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i1115 = i10 << 3;
                    int i1116 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1115 & 112) | (i1116 & 896) | (i1116 & 7168) | (i1115 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                }
                z5 = z4;
                tq3Var2 = tq3VarColors;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                }
            }
            i3 |= 24576;
            z4 = z2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tq3VarColors = tq3Var;
                    if (kk0Var2.h(tq3VarColors)) {
                    }
                    i3 |= i12;
                } else {
                    tq3VarColors = tq3Var;
                }
                i3 |= i12;
            } else {
                tq3VarColors = tq3Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion13 = c.i;
                        un3 un3Var13 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i1117 = i10 << 3;
                    int i1118 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1117 & 112) | (i1118 & 896) | (i1118 & 7168) | (i1117 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion14 = c.i;
                        un3 un3Var14 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i1119 = i10 << 3;
                    int i11110 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1119 & 112) | (i11110 & 896) | (i11110 & 7168) | (i1119 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                }
                z5 = z4;
                tq3Var2 = tq3VarColors;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                }
                kk0Var2.s();
                kk0Var2.a0(783532531);
                if (gh2Var3 == null) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var2);
                    }
                    gh2Var4 = (gh2) objP;
                } else {
                    gh2Var4 = gh2Var3;
                }
                kk0Var2.r(false);
                if (le1Var != null) {
                    Modifier$Companion modifier$Companion15 = c.i;
                    un3 un3Var15 = vq1.a;
                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                } else {
                    cVarB = c.i;
                }
                int i11111 = i10 << 3;
                int i11112 = i10 >> 6;
                kk0Var = kk0Var2;
                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i11111 & 112) | (i11112 & 896) | (i11112 & 7168) | (i11111 & 57344));
                cVar2 = cVar4;
                ne1Var4 = ne1Var3;
                gh2Var5 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                }
                kk0Var2.s();
                kk0Var2.a0(783532531);
                if (gh2Var3 == null) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var2);
                    }
                    gh2Var4 = (gh2) objP;
                } else {
                    gh2Var4 = gh2Var3;
                }
                kk0Var2.r(false);
                if (le1Var != null) {
                    Modifier$Companion modifier$Companion16 = c.i;
                    un3 un3Var16 = vq1.a;
                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                } else {
                    cVarB = c.i;
                }
                int i11113 = i10 << 3;
                int i11114 = i10 >> 6;
                kk0Var = kk0Var2;
                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i11113 & 112) | (i11114 & 896) | (i11114 & 7168) | (i11113 & 57344));
                cVar2 = cVar4;
                ne1Var4 = ne1Var3;
                gh2Var5 = gh2Var3;
            }
            z5 = z4;
            tq3Var2 = tq3VarColors;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                ne1Var2 = ne1Var;
                if (kk0Var2.j(ne1Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (kk0Var2.i(z4)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tq3VarColors = tq3Var;
                        if (kk0Var2.h(tq3VarColors)) {
                        }
                        i3 |= i12;
                    } else {
                        tq3VarColors = tq3Var;
                    }
                    i3 |= i12;
                } else {
                    tq3VarColors = tq3Var;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gh2Var2 = gh2Var;
                        if (kk0Var2.h(gh2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((599187 & i3) == 599186) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        } else {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        }
                        kk0Var2.s();
                        kk0Var2.a0(783532531);
                        if (gh2Var3 == null) {
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = fq2.j(kk0Var2);
                            }
                            gh2Var4 = (gh2) objP;
                        } else {
                            gh2Var4 = gh2Var3;
                        }
                        kk0Var2.r(false);
                        if (le1Var != null) {
                            Modifier$Companion modifier$Companion17 = c.i;
                            un3 un3Var17 = vq1.a;
                            cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                        } else {
                            cVarB = c.i;
                        }
                        int i11115 = i10 << 3;
                        int i11116 = i10 >> 6;
                        kk0Var = kk0Var2;
                        SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i11115 & 112) | (i11116 & 896) | (i11116 & 7168) | (i11115 & 57344));
                        cVar2 = cVar4;
                        ne1Var4 = ne1Var3;
                        gh2Var5 = gh2Var3;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        } else {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                ne1Var2 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                tq3VarColors = uq3.a.colors(kk0Var2, 6);
                            }
                            if (i8 != 0) {
                                i10 = i3;
                                cVar4 = cVar3;
                                gh2Var3 = null;
                                ne1Var3 = ne1Var2;
                            } else {
                                cVar4 = cVar3;
                                ne1Var3 = ne1Var2;
                                gh2Var3 = gh2Var2;
                                i10 = i3;
                            }
                        }
                        kk0Var2.s();
                        kk0Var2.a0(783532531);
                        if (gh2Var3 == null) {
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                objP = fq2.j(kk0Var2);
                            }
                            gh2Var4 = (gh2) objP;
                        } else {
                            gh2Var4 = gh2Var3;
                        }
                        kk0Var2.r(false);
                        if (le1Var != null) {
                            Modifier$Companion modifier$Companion18 = c.i;
                            un3 un3Var18 = vq1.a;
                            cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                        } else {
                            cVarB = c.i;
                        }
                        int i11117 = i10 << 3;
                        int i11118 = i10 >> 6;
                        kk0Var = kk0Var2;
                        SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i11117 & 112) | (i11118 & 896) | (i11118 & 7168) | (i11117 & 57344));
                        cVar2 = cVar4;
                        ne1Var4 = ne1Var3;
                        gh2Var5 = gh2Var3;
                    }
                    z5 = z4;
                    tq3Var2 = tq3VarColors;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                    }
                }
                i3 |= 1572864;
                gh2Var2 = gh2Var;
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion19 = c.i;
                        un3 un3Var19 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i11119 = i10 << 3;
                    int i111110 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i11119 & 112) | (i111110 & 896) | (i111110 & 7168) | (i11119 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion110 = c.i;
                        un3 un3Var110 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i111111 = i10 << 3;
                    int i111112 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i111111 & 112) | (i111112 & 896) | (i111112 & 7168) | (i111111 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                }
                z5 = z4;
                tq3Var2 = tq3VarColors;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                }
            }
            i3 |= 24576;
            z4 = z2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tq3VarColors = tq3Var;
                    if (kk0Var2.h(tq3VarColors)) {
                    }
                    i3 |= i12;
                } else {
                    tq3VarColors = tq3Var;
                }
                i3 |= i12;
            } else {
                tq3VarColors = tq3Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion111 = c.i;
                        un3 un3Var111 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i111113 = i10 << 3;
                    int i111114 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i111113 & 112) | (i111114 & 896) | (i111114 & 7168) | (i111113 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion112 = c.i;
                        un3 un3Var112 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i111115 = i10 << 3;
                    int i111116 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i111115 & 112) | (i111116 & 896) | (i111116 & 7168) | (i111115 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                }
                z5 = z4;
                tq3Var2 = tq3VarColors;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                }
                kk0Var2.s();
                kk0Var2.a0(783532531);
                if (gh2Var3 == null) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var2);
                    }
                    gh2Var4 = (gh2) objP;
                } else {
                    gh2Var4 = gh2Var3;
                }
                kk0Var2.r(false);
                if (le1Var != null) {
                    Modifier$Companion modifier$Companion113 = c.i;
                    un3 un3Var113 = vq1.a;
                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                } else {
                    cVarB = c.i;
                }
                int i111117 = i10 << 3;
                int i111118 = i10 >> 6;
                kk0Var = kk0Var2;
                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i111117 & 112) | (i111118 & 896) | (i111118 & 7168) | (i111117 & 57344));
                cVar2 = cVar4;
                ne1Var4 = ne1Var3;
                gh2Var5 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                }
                kk0Var2.s();
                kk0Var2.a0(783532531);
                if (gh2Var3 == null) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var2);
                    }
                    gh2Var4 = (gh2) objP;
                } else {
                    gh2Var4 = gh2Var3;
                }
                kk0Var2.r(false);
                if (le1Var != null) {
                    Modifier$Companion modifier$Companion114 = c.i;
                    un3 un3Var114 = vq1.a;
                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                } else {
                    cVarB = c.i;
                }
                int i111119 = i10 << 3;
                int i1111110 = i10 >> 6;
                kk0Var = kk0Var2;
                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i111119 & 112) | (i1111110 & 896) | (i1111110 & 7168) | (i111119 & 57344));
                cVar2 = cVar4;
                ne1Var4 = ne1Var3;
                gh2Var5 = gh2Var3;
            }
            z5 = z4;
            tq3Var2 = tq3VarColors;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
            }
        }
        i3 |= 3072;
        ne1Var2 = ne1Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                z4 = z2;
                if (kk0Var2.i(z4)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tq3VarColors = tq3Var;
                    if (kk0Var2.h(tq3VarColors)) {
                    }
                    i3 |= i12;
                } else {
                    tq3VarColors = tq3Var;
                }
                i3 |= i12;
            } else {
                tq3VarColors = tq3Var;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gh2Var2 = gh2Var;
                    if (kk0Var2.h(gh2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((599187 & i3) == 599186) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion115 = c.i;
                        un3 un3Var115 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i1111111 = i10 << 3;
                    int i1111112 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1111111 & 112) | (i1111112 & 896) | (i1111112 & 7168) | (i1111111 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    } else {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            ne1Var2 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            tq3VarColors = uq3.a.colors(kk0Var2, 6);
                        }
                        if (i8 != 0) {
                            i10 = i3;
                            cVar4 = cVar3;
                            gh2Var3 = null;
                            ne1Var3 = ne1Var2;
                        } else {
                            cVar4 = cVar3;
                            ne1Var3 = ne1Var2;
                            gh2Var3 = gh2Var2;
                            i10 = i3;
                        }
                    }
                    kk0Var2.s();
                    kk0Var2.a0(783532531);
                    if (gh2Var3 == null) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = fq2.j(kk0Var2);
                        }
                        gh2Var4 = (gh2) objP;
                    } else {
                        gh2Var4 = gh2Var3;
                    }
                    kk0Var2.r(false);
                    if (le1Var != null) {
                        Modifier$Companion modifier$Companion116 = c.i;
                        un3 un3Var116 = vq1.a;
                        cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                    } else {
                        cVarB = c.i;
                    }
                    int i1111113 = i10 << 3;
                    int i1111114 = i10 >> 6;
                    kk0Var = kk0Var2;
                    SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1111113 & 112) | (i1111114 & 896) | (i1111114 & 7168) | (i1111113 & 57344));
                    cVar2 = cVar4;
                    ne1Var4 = ne1Var3;
                    gh2Var5 = gh2Var3;
                }
                z5 = z4;
                tq3Var2 = tq3VarColors;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
                }
            }
            i3 |= 1572864;
            gh2Var2 = gh2Var;
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                }
                kk0Var2.s();
                kk0Var2.a0(783532531);
                if (gh2Var3 == null) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var2);
                    }
                    gh2Var4 = (gh2) objP;
                } else {
                    gh2Var4 = gh2Var3;
                }
                kk0Var2.r(false);
                if (le1Var != null) {
                    Modifier$Companion modifier$Companion117 = c.i;
                    un3 un3Var117 = vq1.a;
                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                } else {
                    cVarB = c.i;
                }
                int i1111115 = i10 << 3;
                int i1111116 = i10 >> 6;
                kk0Var = kk0Var2;
                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1111115 & 112) | (i1111116 & 896) | (i1111116 & 7168) | (i1111115 & 57344));
                cVar2 = cVar4;
                ne1Var4 = ne1Var3;
                gh2Var5 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                }
                kk0Var2.s();
                kk0Var2.a0(783532531);
                if (gh2Var3 == null) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var2);
                    }
                    gh2Var4 = (gh2) objP;
                } else {
                    gh2Var4 = gh2Var3;
                }
                kk0Var2.r(false);
                if (le1Var != null) {
                    Modifier$Companion modifier$Companion118 = c.i;
                    un3 un3Var118 = vq1.a;
                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                } else {
                    cVarB = c.i;
                }
                int i1111117 = i10 << 3;
                int i1111118 = i10 >> 6;
                kk0Var = kk0Var2;
                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1111117 & 112) | (i1111118 & 896) | (i1111118 & 7168) | (i1111117 & 57344));
                cVar2 = cVar4;
                ne1Var4 = ne1Var3;
                gh2Var5 = gh2Var3;
            }
            z5 = z4;
            tq3Var2 = tq3VarColors;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
            }
        }
        i3 |= 24576;
        z4 = z2;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                tq3VarColors = tq3Var;
                if (kk0Var2.h(tq3VarColors)) {
                }
                i3 |= i12;
            } else {
                tq3VarColors = tq3Var;
            }
            i3 |= i12;
        } else {
            tq3VarColors = tq3Var;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                gh2Var2 = gh2Var;
                if (kk0Var2.h(gh2Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((599187 & i3) == 599186) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                }
                kk0Var2.s();
                kk0Var2.a0(783532531);
                if (gh2Var3 == null) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var2);
                    }
                    gh2Var4 = (gh2) objP;
                } else {
                    gh2Var4 = gh2Var3;
                }
                kk0Var2.r(false);
                if (le1Var != null) {
                    Modifier$Companion modifier$Companion119 = c.i;
                    un3 un3Var119 = vq1.a;
                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                } else {
                    cVarB = c.i;
                }
                int i1111119 = i10 << 3;
                int i11111110 = i10 >> 6;
                kk0Var = kk0Var2;
                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i1111119 & 112) | (i11111110 & 896) | (i11111110 & 7168) | (i1111119 & 57344));
                cVar2 = cVar4;
                ne1Var4 = ne1Var3;
                gh2Var5 = gh2Var3;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                } else {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        ne1Var2 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        tq3VarColors = uq3.a.colors(kk0Var2, 6);
                    }
                    if (i8 != 0) {
                        i10 = i3;
                        cVar4 = cVar3;
                        gh2Var3 = null;
                        ne1Var3 = ne1Var2;
                    } else {
                        cVar4 = cVar3;
                        ne1Var3 = ne1Var2;
                        gh2Var3 = gh2Var2;
                        i10 = i3;
                    }
                }
                kk0Var2.s();
                kk0Var2.a0(783532531);
                if (gh2Var3 == null) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var2);
                    }
                    gh2Var4 = (gh2) objP;
                } else {
                    gh2Var4 = gh2Var3;
                }
                kk0Var2.r(false);
                if (le1Var != null) {
                    Modifier$Companion modifier$Companion1110 = c.i;
                    un3 un3Var1110 = vq1.a;
                    cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
                } else {
                    cVarB = c.i;
                }
                int i11111111 = i10 << 3;
                int i11111112 = i10 >> 6;
                kk0Var = kk0Var2;
                SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i11111111 & 112) | (i11111112 & 896) | (i11111112 & 7168) | (i11111111 & 57344));
                cVar2 = cVar4;
                ne1Var4 = ne1Var3;
                gh2Var5 = gh2Var3;
            }
            z5 = z4;
            tq3Var2 = tq3VarColors;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
            }
        }
        i3 |= 1572864;
        gh2Var2 = gh2Var;
        if ((599187 & i3) == 599186) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    ne1Var2 = null;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    tq3VarColors = uq3.a.colors(kk0Var2, 6);
                }
                if (i8 != 0) {
                    i10 = i3;
                    cVar4 = cVar3;
                    gh2Var3 = null;
                    ne1Var3 = ne1Var2;
                } else {
                    cVar4 = cVar3;
                    ne1Var3 = ne1Var2;
                    gh2Var3 = gh2Var2;
                    i10 = i3;
                }
            } else {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    ne1Var2 = null;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    tq3VarColors = uq3.a.colors(kk0Var2, 6);
                }
                if (i8 != 0) {
                    i10 = i3;
                    cVar4 = cVar3;
                    gh2Var3 = null;
                    ne1Var3 = ne1Var2;
                } else {
                    cVar4 = cVar3;
                    ne1Var3 = ne1Var2;
                    gh2Var3 = gh2Var2;
                    i10 = i3;
                }
            }
            kk0Var2.s();
            kk0Var2.a0(783532531);
            if (gh2Var3 == null) {
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = fq2.j(kk0Var2);
                }
                gh2Var4 = (gh2) objP;
            } else {
                gh2Var4 = gh2Var3;
            }
            kk0Var2.r(false);
            if (le1Var != null) {
                Modifier$Companion modifier$Companion1111 = c.i;
                un3 un3Var1111 = vq1.a;
                cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
            } else {
                cVarB = c.i;
            }
            int i11111113 = i10 << 3;
            int i11111114 = i10 >> 6;
            kk0Var = kk0Var2;
            SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i11111113 & 112) | (i11111114 & 896) | (i11111114 & 7168) | (i11111113 & 57344));
            cVar2 = cVar4;
            ne1Var4 = ne1Var3;
            gh2Var5 = gh2Var3;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    ne1Var2 = null;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    tq3VarColors = uq3.a.colors(kk0Var2, 6);
                }
                if (i8 != 0) {
                    i10 = i3;
                    cVar4 = cVar3;
                    gh2Var3 = null;
                    ne1Var3 = ne1Var2;
                } else {
                    cVar4 = cVar3;
                    ne1Var3 = ne1Var2;
                    gh2Var3 = gh2Var2;
                    i10 = i3;
                }
            } else {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    ne1Var2 = null;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    tq3VarColors = uq3.a.colors(kk0Var2, 6);
                }
                if (i8 != 0) {
                    i10 = i3;
                    cVar4 = cVar3;
                    gh2Var3 = null;
                    ne1Var3 = ne1Var2;
                } else {
                    cVar4 = cVar3;
                    ne1Var3 = ne1Var2;
                    gh2Var3 = gh2Var2;
                    i10 = i3;
                }
            }
            kk0Var2.s();
            kk0Var2.a0(783532531);
            if (gh2Var3 == null) {
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = fq2.j(kk0Var2);
                }
                gh2Var4 = (gh2) objP;
            } else {
                gh2Var4 = gh2Var3;
            }
            kk0Var2.r(false);
            if (le1Var != null) {
                Modifier$Companion modifier$Companion1112 = c.i;
                un3 un3Var1112 = vq1.a;
                cVarB = androidx.compose.foundation.selection.b.b(MinimumInteractiveModifier.c, z3, gh2Var4, null, z4, new n73(2), le1Var);
            } else {
                cVarB = c.i;
            }
            int i11111115 = i10 << 3;
            int i11111116 = i10 >> 6;
            kk0Var = kk0Var2;
            SwitchImpl(d.h(d.q(cVar4.then(cVarB), Alignment$Companion.getCenter())), z, z4, tq3VarColors, ne1Var3, gh2Var4, wg3.getValue(tg3.m, kk0Var2, 6), kk0Var, (i11111115 & 112) | (i11111116 & 896) | (i11111116 & 7168) | (i11111115 & 57344));
            cVar2 = cVar4;
            ne1Var4 = ne1Var3;
            gh2Var5 = gh2Var3;
        }
        z5 = z4;
        tq3Var2 = tq3VarColors;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ml1(z, le1Var, cVar2, ne1Var4, z5, tq3Var2, gh2Var5, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchImpl(c cVar, boolean z, boolean z2, tq3 tq3Var, ne1 ne1Var, uq1 uq1Var, rg3 rg3Var, ck0 ck0Var, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1594099146);
        xk xkVar = kk0Var.a;
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.i(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.i(z2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var.h(tq3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var.j(ne1Var) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= kk0Var.h(uq1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= kk0Var.h(rg3Var) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((i3 & 599187) == 599186 && kk0Var.F()) {
            kk0Var.V();
        } else {
            if (z2) {
                j = z ? tq3Var.b : tq3Var.f;
            } else {
                j = z ? tq3Var.j : tq3Var.n;
            }
            if (z2) {
                j2 = z ? tq3Var.a : tq3Var.e;
            } else {
                j2 = z ? tq3Var.i : tq3Var.m;
            }
            rg3 value = wg3.getValue(tg3.m, kk0Var, 6);
            if (z2) {
                j3 = j2;
                j4 = z ? tq3Var.c : tq3Var.g;
            } else {
                j3 = j2;
                j4 = z ? tq3Var.k : tq3Var.o;
            }
            c cVarB = androidx.compose.foundation.a.b(sf3.h(cVar, 2.0f, j4, value), j, value);
            vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = androidx.compose.ui.b.d(kk0Var, cVarB);
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
            pe peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            c cVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.d.a(androidx.compose.foundation.layout.b.a.a(c.i, Alignment$Companion.getCenterStart()).then(new ThumbElement(uq1Var, z)), uq1Var, g73.m194xaeb141ad(false, 20.0f, 0L, kk0Var, 54, 4)), j3, rg3Var);
            vb2 vb2VarC2 = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = androidx.compose.ui.b.d(kk0Var, cVarB2);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            pe peVarH2 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN2);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            kk0Var.a0(1163457794);
            if (ne1Var != null) {
                if (z2) {
                    j5 = z ? tq3Var.d : tq3Var.h;
                } else {
                    j5 = z ? tq3Var.l : tq3Var.p;
                }
                yk0.CompositionLocalProvider(fq2.k(j5, gn0.a), ne1Var, kk0Var, ((i3 >> 9) & 112) | 8);
            }
            kk0Var.r(false);
            kk0Var.r(true);
            kk0Var.r(true);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new vq3(cVar, z, z2, tq3Var, ne1Var, uq1Var, rg3Var, i));
        }
    }
}
